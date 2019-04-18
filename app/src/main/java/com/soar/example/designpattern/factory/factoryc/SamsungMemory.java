package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体产品类-- 三星 内存
public class SamsungMemory extends Memory {

    @Override
    public void showMemory() {
        System.out.println("三星 内存");
    }
}
