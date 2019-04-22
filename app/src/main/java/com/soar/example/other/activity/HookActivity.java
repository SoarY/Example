package com.soar.example.other.activity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.soar.example.R;
import com.soar.example.hook.HookedClickListenerProxy;
import com.soar.example.hook.NotificationProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * https://blog.csdn.net/gdutxiaoxu/article/details/81459830
 */
public class HookActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook);
        initView();
    }

    private void initView() {
        //静态代理hook
        findViewById(R.id.bt_click_hook).setOnClickListener(this);
        try {
            hookClickListener(findViewById(R.id.bt_click_hook));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //动态代理hook
        findViewById(R.id.bt_notification_hook).setOnClickListener(this);
        try {
            hookNotificationManager(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 静态代理hook
     */
    private void hookClickListener(View view) throws Exception {
        // 第一步：反射得到 ListenerInfo 对象 OnClickListener事件方法字段
        Method getListenerInfo = View.class.getDeclaredMethod("getListenerInfo");
        getListenerInfo.setAccessible(true);
        Object listenerInfo = getListenerInfo.invoke(view);
        Class<?> listenerInfoClz = Class.forName("android.view.View$ListenerInfo");
        Field mOnClickListener = listenerInfoClz.getDeclaredField("mOnClickListener");
        mOnClickListener.setAccessible(true);
        View.OnClickListener originOnClickListener = (View.OnClickListener) mOnClickListener.get(listenerInfo);
        // 第二步：自定义静态代理对象
        View.OnClickListener hookedOnClickListener = new HookedClickListenerProxy(originOnClickListener);
        // 第三步：用 Hook代理类 替换原始的 OnClickListener
        mOnClickListener.set(listenerInfo, hookedOnClickListener);
    }

    /**
     * 动态代理hook
     */
    public static void hookNotificationManager( Context context) throws Exception {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        Method getService = NotificationManager.class.getDeclaredMethod("getService");
        getService.setAccessible(true);
        // 第一步：得到系统的 sService
        final Object sOriginService = getService.invoke(notificationManager);

        Class iNotiMngClz = Class.forName("android.app.INotificationManager");
        // 第二步：得到我们的动态代理对象
        Object proxyNotiMng = Proxy.newProxyInstance(context.getClass().getClassLoader(), new
                Class[]{iNotiMngClz}, new NotificationProxy(sOriginService));
        // 第三步：偷梁换柱，使用 proxyNotiMng 替换系统的 sService
        Field sServiceField = NotificationManager.class.getDeclaredField("sService");
        sServiceField.setAccessible(true);
        sServiceField.set(notificationManager, proxyNotiMng);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_click_hook:
                //逻辑代码
                break;
            case R.id.bt_notification_hook:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                    sendChatMsg();
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void sendChatMsg() {
        String channelId = "chat";
        String channelName = "聊天消息";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);
        NotificationManager notificationManager = (NotificationManager) getSystemService(
                NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(channel);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification = new NotificationCompat.Builder(this, "chat")
                .setContentTitle("收到一条聊天消息")
                .setContentText("今天中午吃什么？")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                .setAutoCancel(true)
                .build();
        manager.notify(1, notification);
    }
}
