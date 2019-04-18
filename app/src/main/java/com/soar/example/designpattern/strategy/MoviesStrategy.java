package com.soar.example.designpattern.strategy;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:
 */
public class MoviesStrategy implements ChaseStragety {

    @Override
    public void chase() {
        System.out.println("一起看电影咯~");
    }
}
