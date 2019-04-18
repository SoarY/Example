package com.soar.example.designpattern.factory.factorya;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe: 工厂方法模式
 * https://www.jianshu.com/p/e6c02a54f447
 */
public class FactoryB extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
