package com.soar.example.designpattern.decorator;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class Kitchen extends RoomDecorator {//厨房类，继承自RoomDecorator

    public Kitchen(Room room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addKitchenware();
    }

    private void addKitchenware() {
        System.out.println("装修成厨房：添加厨具");
    }
}
