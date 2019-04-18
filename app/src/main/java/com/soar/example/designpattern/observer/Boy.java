package com.soar.example.designpattern.observer;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class Boy implements Observer {

    private String name;//名字
    public Boy(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {//男孩的具体反应
        System.out.println(name + ",收到了信息:" + message+"屁颠颠的去取快递.");
    }
}
