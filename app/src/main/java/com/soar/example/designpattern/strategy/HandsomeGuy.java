package com.soar.example.designpattern.strategy;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
public class HandsomeGuy {

    private ChaseStragety chaseStragety;//定义抽象策略类

    public HandsomeGuy(ChaseStragety chaseStragety) {//构造方法传递具体策略对象过来
        this.chaseStragety = chaseStragety;
    }

    //测试
    public void chase() {
        chaseStragety.chase();//执行具体策略对象的策略
    }
}
