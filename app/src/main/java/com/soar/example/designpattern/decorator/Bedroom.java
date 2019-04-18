package com.soar.example.designpattern.decorator;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public class Bedroom extends RoomDecorator {//卧室类，继承自RoomDecorator

    public Bedroom(Room room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addBedding();
    }

    private void addBedding() {
        System.out.println("装修成卧室：添加卧具");
    }
}
