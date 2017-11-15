package com.wen.smark.link;


/**
 * Created by wen_toto on 2017/8/11.
 */

public class LinkList {

    private People people;
    private LinkList next = null;


    public boolean push(LinkList linkList){
        this.next = linkList;
        return true;
    }

    public LinkList pop(){
        return this.next;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }


}
