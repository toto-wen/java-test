package com.wen.smark.ExtendsTest;

/**
 * Created by wen_toto on 2017/8/17.
 */

public class carPrivate{

    private Busy busy;

    public carPrivate(){}

    public carPrivate(Busy busy){
        this.busy = busy;
    }

    public void Print(){
        busy.Print();
    }

    public static void main(String[] args){
        carPrivate car = new carPrivate(new NewCar());
        car.Print();

        carPrivate car1 = new carPrivate(new SonBusy());
        car1.Print();
    }

}
