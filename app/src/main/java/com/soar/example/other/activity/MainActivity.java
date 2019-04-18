package com.soar.example.other.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.soar.example.R;
import com.soar.example.designpattern.builder.Person;
import com.soar.example.designpattern.builder.Person2;
import com.soar.example.designpattern.builder.Person3;
import com.soar.example.designpattern.builder.Person4;
import com.soar.example.designpattern.decorator.Bedroom;
import com.soar.example.designpattern.decorator.Kitchen;
import com.soar.example.designpattern.decorator.NewRoom;
import com.soar.example.designpattern.factory.factoryc.CPU;
import com.soar.example.designpattern.factory.factoryc.HD;
import com.soar.example.designpattern.factory.factoryc.LenovoComputerFactory;
import com.soar.example.designpattern.factory.factoryc.Memory;
import com.soar.example.designpattern.observer.Boy;
import com.soar.example.designpattern.observer.Girl;
import com.soar.example.designpattern.observer.Observable;
import com.soar.example.designpattern.observer.Observer;
import com.soar.example.designpattern.observer.Postman;
import com.soar.example.designpattern.observer.other.MyObservable;
import com.soar.example.designpattern.proxy.Domestic;
import com.soar.example.designpattern.proxy.DynamicProxy;
import com.soar.example.designpattern.proxy.People;
import com.soar.example.designpattern.singleton.SingleClient;
import com.soar.example.designpattern.singleton.Singleton;
import com.soar.example.designpattern.statepattern.TvController;
import com.soar.example.designpattern.strategy.EattingStrategy;
import com.soar.example.designpattern.strategy.HandsomeGuy;
import com.soar.example.designpattern.strategy.MoviesStrategy;
import com.soar.example.designpattern.strategy.ShoppingStrategy;

import java.lang.reflect.Proxy;

/**
 * https://www.jianshu.com/p/a0e687e0904f
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);
        findViewById(R.id.bt_3).setOnClickListener(this);
        findViewById(R.id.bt_4).setOnClickListener(this);
        findViewById(R.id.bt_5).setOnClickListener(this);
        findViewById(R.id.bt_6).setOnClickListener(this);
        findViewById(R.id.bt_7).setOnClickListener(this);
        findViewById(R.id.bt_8).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_1://单例模式
                Singleton singleton = Singleton.getSingleton();
                SingleClient singleClient = SingleClient.getInstance();
                break;
            case R.id.bt_2://建造者模式-build模式
                Person soarsy = new Person.Builder()
                        .setName("soarsy")
                        .age("25")
                        .build();
                Person2 soarsy2 = new Person2.Builder("soarsy", "25")
                        .car("Lamborghini")
                        .build();
                Person3 soarsy3 = new Person3.Builder()
                        .setName("soarsy")
                        .car("Lamborghini")
                        .build();
                Person4 soarsy4 = new Person4.Builder("soarsy", "Lamborghini")
                        .money("10000000000")
                        .build();
                break;
            case R.id.bt_3://工厂模式
                //工厂方法模式
                //                Product producta = new FactoryA().createProduct();
                //                Product productb = new FactoryB().createProduct();
                //                producta.method();

                //简单工厂模式
                //                ProductA productA = PorscheFactory.create(ProductA.class);
                //                productA.method();

                //抽象工厂模式
                LenovoComputerFactory factory = new LenovoComputerFactory();
                CPU cpu = factory.createCPU();
                HD hd = factory.createHD();
                Memory memory = factory.createMemory();
                memory.showMemory();
                break;
            case R.id.bt_4://策略模式
                System.out.println("遇到爱逛街的妹子:");
                HandsomeGuy handsomeguy = new HandsomeGuy(new ShoppingStrategy());
                handsomeguy.chase();

                System.out.println("遇到爱看电影的妹子:");
                handsomeguy = new HandsomeGuy(new MoviesStrategy());
                handsomeguy.chase();

                System.out.println("遇到吃货妹子:");
                handsomeguy = new HandsomeGuy(new EattingStrategy());
                handsomeguy.chase();
                break;
            case R.id.bt_5://状态模式
                //不同状态,不同行为
                TvController tvController = new TvController();
                //on
                tvController.powerOn();
                tvController.turnDown();
                tvController.turnUp();
                //off
                tvController.powerOff();
                tvController.turnDown();
                break;
            case R.id.bt_6://观察者模式
                Observable postman = new Postman();

                Observer boy1 = new Boy("路飞");
                Observer boy2 = new Boy("乔巴");
                Observer girl1 = new Girl("娜美");

                postman.add(boy1);
                postman.add(boy2);
                postman.add(girl1);
                postman.add(message -> System.out.println("GO"));

                postman.notify("快递到了,请下楼领取.");

                //JAVA观察者模式
                java.util.Observer observer = (o, arg) -> System.out.println("布吉岛");
                MyObservable.getInstance().addObserver(observer);
                MyObservable.getInstance().notifyObservers("小哥哥来了知道了吗?");
                MyObservable.getInstance().deleteObserver(observer);
                break;
            case R.id.bt_7://装饰者模式
                NewRoom newRoom = new NewRoom();
                Bedroom bedroom = new Bedroom(newRoom);
                bedroom.fitment();
                Kitchen kitchen = new Kitchen(newRoom);
                kitchen.fitment();
                break;
            case R.id.bt_8://代理模式
                //静态代理
                //                                People domestic = new Domestic();        //创建国内购买人
                //                                People oversea = new Oversea(domestic);  //创建海外代购类并将domestic作为构造函数传递
                //                                oversea.buy();                           //调用海外代购的buy()

                //动态代理
                People domestic = new Domestic();                                 //创建国内购买人
                DynamicProxy proxy = new DynamicProxy(domestic);                  //创建动态代理
                ClassLoader classLoader = domestic.getClass().getClassLoader();
                People oversea = (People) Proxy.newProxyInstance(classLoader, new Class[]{People.class}, proxy); //通过 Proxy 创建海外代购实例 ，实际上通过反射来实现的。
                oversea.buy();//调用海外代购的buy()
                break;
        }
    }
}
