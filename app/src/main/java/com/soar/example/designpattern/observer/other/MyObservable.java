package com.soar.example.designpattern.observer.other;

import java.util.Observable;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class MyObservable extends Observable {
    private static volatile MyObservable mInstance;

    private MyObservable() {
    }

    public static MyObservable getInstance() {
        if (mInstance == null)
            synchronized (MyObservable.class) {
                if (mInstance == null)
                    mInstance = new MyObservable();
            }
        return mInstance;
    }

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
}
