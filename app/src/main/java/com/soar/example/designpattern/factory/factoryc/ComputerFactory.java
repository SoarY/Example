package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//抽象工厂类，电脑工厂类
public abstract class ComputerFactory {
    public abstract CPU createCPU();

    public abstract Memory createMemory();

    public abstract HD createHD();
}
