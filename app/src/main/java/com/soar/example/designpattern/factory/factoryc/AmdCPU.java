package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体产品类-- AMD CPU
public class AmdCPU extends CPU {

    @Override
    public void showCPU() {
        System.out.println("AMD CPU");
    }
}
