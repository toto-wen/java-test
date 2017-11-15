package com.wen.smark.entity;

/**
 * Created by wen_toto on 2017/8/16.
 */

public class IdEntity<T> {
    protected static final long serialVersionUID = 1L;
    /**
     * 实体IDd
     */
    protected T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BigEntity{" +
                "id=" + id +
                '}';
    }
}
