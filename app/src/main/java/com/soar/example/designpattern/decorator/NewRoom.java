package com.soar.example.designpattern.decorator;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class NewRoom extends Room {//继承Room
    @Override
    public void fitment() {
        System.out.println("这是一间新房：装上电");
    }
}
