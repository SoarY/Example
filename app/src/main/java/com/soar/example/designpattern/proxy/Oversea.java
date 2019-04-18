package com.soar.example.designpattern.proxy;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class Oversea implements People {
    People mPeople;//持有People类的引用

    public Oversea(People people) {
        mPeople = people;
    }

    @Override
    public void buy() {
        System.out.println("我是海外代购：");
        mPeople.buy();//调用了被代理者的buy()方法,
    }
}
