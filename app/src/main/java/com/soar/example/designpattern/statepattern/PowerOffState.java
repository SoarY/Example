package com.soar.example.designpattern.statepattern;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
public class PowerOffState implements TvState {

    @Override
    public void nextChannerl() {
        //不同状态不同行为
        //off 不做处理
    }

    @Override
    public void prevChannerl() {

    }

    @Override
    public void turnUp() {
    }

    @Override
    public void turnDown() {
    }
}
