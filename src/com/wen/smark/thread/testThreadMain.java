package com.wen.smark.thread;

/**
 * Created by wen_toto on 2017/8/23.
 */

public class testThreadMain {
    public static void main(String[] args){
//        System.out.println(new LiftOff().ab());
        Thread thread = new Thread(new LiftOff());
        thread.start();
    }
}
