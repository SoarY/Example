package com.soar.example.designpattern.statepattern;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannerl() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannerl() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
