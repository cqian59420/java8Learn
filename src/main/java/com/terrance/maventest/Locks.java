package com.terrance.maventest;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by qizhi on 2016/6/2.
 */

public class Locks {
    Bird bird;

    public Locks(Bird bird) {
        this.bird = bird;
    }

    public static void main(String[] args) {
        new Locks(new Bird() {
            @Override
            void test() {
                super.test();
            }
        });
    }
}
abstract class Bird{

    void test(){
        System.out.println("test in brid");
    }
}