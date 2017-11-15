package com.wen.smark.ExtendsTest;

/**
 * Created by wen_toto on 2017/8/17.
 */

public class Busy {

    protected int size;

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public void Print(){
        System.out.println("Busy size: ");
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+"@"+this.size;
    }

}
