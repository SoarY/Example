package com.soar.example.designpattern.factory.factorya;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe: 工厂方法模式
 *
 */
public class FactoryA extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
