package com.soar.example.designpattern.proxy;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class Domestic implements People {

    @Override
    public void buy() {//具体实现
        System.out.println("国内要买一个包");
    }
}
