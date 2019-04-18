package com.soar.example.designpattern.decorator;

/**
 * NAME：YONG_
 * Created at: 2019/4/18
 * Describe:
 */
public abstract class RoomDecorator extends Room {//继承Room，拥有父类相同的方法
    private Room mRoom;//持有被装饰者的引用，这里是需要装修的房间

    public RoomDecorator(Room room) {
        this.mRoom = room;
    }

    @Override
    public void fitment() {
        mRoom.fitment();//调用被装饰者的方法
    }
}
