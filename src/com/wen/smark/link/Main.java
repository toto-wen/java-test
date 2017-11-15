package com.wen.smark.link;


import java.util.Arrays;

/**
 * Created by wen_toto on 2017/8/11.
 */

public class Main {
    private static LinkList head;
    private static LinkList valueOld;
    private static LinkList valueNew;

    public static void main(String[] args){
        People value1;
        int[] intA ={1,3,2,4,5,10,9,8,7,6};
        People[] peoples = new People[3];
        peoples[0] = new People();
        peoples[0].setAge(23);
        peoples[0].setName("w");
        peoples[0].setSex("男");

        peoples[1] = new People();
        peoples[1].setAge(34);
        peoples[1].setSex("女");
        peoples[1].setName("e");

        peoples[2] = new People();
        peoples[2].setAge(20);
        peoples[2].setSex("女");
        peoples[2].setName("n");

        String[] s = {"abc" ,"fgh","def", "bcd"};
        Arrays.sort(s);

        String[][] strings ={{"*"},{"*","*"}};
//        Arrays.sort(intA);
//
//        for (int i = 0; i < intA.length; i ++){
//            System.out.print(intA[i] +" ");
//        }
        /**
         * 装载链表
         */
        //第一个
     /*   valueNew = new LinkList();
        value1 = new People();
        value1.setName("wenOne");
        value1.setSex("男");
        value1.setAge(23);
        valueNew.setPeople(value1);
        head = valueNew;
        //第二个
        valueOld = valueNew;
        valueNew = new LinkList();
        value1 = new People();
        value1.setName("wenTwo");
        value1.setSex("女");
        value1.setAge(24);
        valueNew.setPeople(value1);
        valueOld.push(valueNew);
        //第三个
        valueOld = valueNew;
        valueNew = new LinkList();
        value1 = new People();
        value1.setName("wenThree");
        value1.setSex("男");
        value1.setAge(34);
        valueNew.setPeople(value1);
        valueOld.push(valueNew);
        //第四个
        valueOld = valueNew;
        valueNew = new LinkList();
        value1 = new People();
        value1.setName("wenFour");
        value1.setSex("女");
        value1.setAge(21);
        valueNew.setPeople(value1);
        valueOld.push(valueNew);

        for (LinkList getValue = head; getValue != null; getValue = getValue.pop()){
            People people = getValue.getPeople();
            System.out.println(people.toString());
        }*/

    }

}
