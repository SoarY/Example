package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体工厂类--华硕电脑
public class AsusComputerFactory extends ComputerFactory {

    @Override
    public CPU createCPU() {
        return new AmdCPU();
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
