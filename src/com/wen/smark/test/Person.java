package com.wen.smark.test;

import com.wen.smark.exception.MyException;

/**
 * Created by wen_toto on 2017/8/18.
 */

public class Person {
    public static void PrintOne(){
        System.out.println("Person的静态方法");
    }
    public Inner getInner(){
        return new Inner(new Person());
    }
    public void Print(){
        System.out.println("这是Person类");
    }

    protected class Inner{
        private Person person;
        public Inner(){

        }
        public Inner(Person person){
            this.person = person;
        }
        public void Print(){
            Person.this.Print();
            System.out.println("Person的内部实现类");
        }
    }

    public static class InnerOne{
        public  void PrintOne(){
            System.out.println("Person的静态内部类");
        }
    }
    public void Dred(String s) throws MyException {
        if(s == null)
            throw new MyException();
    }

}
