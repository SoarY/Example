package com.soar.example.designpattern.singleton;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:DCL
 */
public class SingleClient {
    private static volatile SingleClient mInstance;

    private SingleClient() {
    }

    public static SingleClient getInstance() {
        if (mInstance == null)
            synchronized (SingleClient.class) {
                if (mInstance == null)
                    mInstance = new SingleClient();
            }
        return mInstance;
    }
}
