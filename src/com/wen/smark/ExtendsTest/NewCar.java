package com.wen.smark.ExtendsTest;

/**
 * Created by wen_toto on 2017/8/17.
 */

public class NewCar extends Busy {

    @Override
    public void Print(){
        super.Print();
        System.out.println("NewCar size");
    }
}
