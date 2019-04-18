package com.soar.example.designpattern.statepattern;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
public class TvController implements PowerController {
    TvState mTvState;

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel() {
        mTvState.nextChannerl();
    }

    public void prevChannel() {
        mTvState.prevChannerl();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }

}
