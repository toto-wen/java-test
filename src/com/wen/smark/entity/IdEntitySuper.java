package com.wen.smark.entity;

import java.util.List;

/**
 * Created by wen_toto on 2017/8/24.
 */

public abstract class IdEntitySuper<T> {
    /**
     * id
     */
    protected  T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public <T> void test(){
        List<T> test = null;
        for (T t: test){

        }
    }
}
