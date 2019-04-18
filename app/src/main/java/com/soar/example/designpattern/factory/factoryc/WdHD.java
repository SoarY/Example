package com.soar.example.designpattern.factory.factoryc;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
//具体产品类-- 西部数据 硬盘
public class WdHD extends HD {

    @Override
    public void showHD() {
        System.out.println("西部数据 硬盘");
    }
}
