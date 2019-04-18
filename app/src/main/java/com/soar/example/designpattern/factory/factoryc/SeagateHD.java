package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体产品类-- 希捷 硬盘
public class SeagateHD extends HD {

    @Override
    public void showHD() {
        System.out.println("希捷 硬盘");
    }
}
