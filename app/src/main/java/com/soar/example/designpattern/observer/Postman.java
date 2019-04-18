package com.soar.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class Postman implements Observable {//快递员

    private List<Observer> personList = new ArrayList<Observer>();//保存收件人（观察者）的信息

    @Override
    public void add(Observer observer) {//添加收件人
        personList.add(observer);
    }

    @Override
    public void remove(Observer observer) {//移除收件人
        personList.remove(observer);

    }

    @Override
    public void notify(String message) {//逐一通知收件人（观察者）
        for (Observer observer : personList)
            observer.update(message);
    }
}
