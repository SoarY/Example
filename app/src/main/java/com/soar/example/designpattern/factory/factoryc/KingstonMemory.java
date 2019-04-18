package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体产品类-- 金士顿 内存
public class KingstonMemory extends Memory {

    @Override
    public void showMemory() {
        System.out.println("金士顿 内存");
    }
}
