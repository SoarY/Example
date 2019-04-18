package com.soar.example.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj;//被代理的对象

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    //重写invoke()方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("海外动态代理调用方法： "+method.getName());
        Object result = method.invoke(obj, args);//调用被代理的对象的方法
        return result;
    }
}
