package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:抽象工厂模式
 */
//具体工厂类--惠普电脑
public class HpComputerFactory extends ComputerFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public Memory createMemory() {
        return new KingstonMemory();
    }

    @Override
    public HD createHD() {
        return new WdHD();
    }
}
