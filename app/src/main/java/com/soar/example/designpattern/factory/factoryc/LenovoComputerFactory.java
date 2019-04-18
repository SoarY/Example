package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体工厂类--联想电脑
public class LenovoComputerFactory extends ComputerFactory {
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public Memory createMemory() {
        return new SamsungMemory();
    }

    @Override
    public HD createHD() {
        return new SeagateHD();
    }
}
