package com.soar.example.designpattern.singleton;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:饿汉式
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
