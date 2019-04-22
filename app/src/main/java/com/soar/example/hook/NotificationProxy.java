package com.soar.example.hook;

import android.widget.Toast;

import com.soar.example.other.MyApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * NAME：YONG_
 * Created at: 2019/4/22
 * Describe:
 */
public class NotificationProxy implements InvocationHandler {
    private final Object sOriginService;

    public NotificationProxy(Object sOriginService) {
        this.sOriginService = sOriginService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Toast.makeText(MyApplication.getContext(), "检测到有人发通知了", Toast.LENGTH_SHORT).show();
        // 操作交由 sOriginService 处理，不拦截通知
        return method.invoke(sOriginService, args);
        // 拦截通知，什么也不做
        //                    return null;
        // 或者是根据通知的 Tag 和 ID 进行筛选
    }
}
