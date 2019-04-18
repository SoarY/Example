package com.soar.example.designpattern.strategy;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
public class ShoppingStrategy implements ChaseStragety {

    @Override
    public void chase() {
        System.out.println("一起逛街咯~");
    }
}
