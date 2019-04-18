package com.soar.example.designpattern.factory.factoryb;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe: 简单工厂模式
 * https://www.jianshu.com/p/e594f140b937
 */
public class PorscheFactory {
    public static <T extends Product> T create(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();//反射出实例
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
