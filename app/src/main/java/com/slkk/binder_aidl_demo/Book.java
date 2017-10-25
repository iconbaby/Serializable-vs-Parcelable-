package com.slkk.binder_aidl_demo;

import java.io.Serializable;

/**
 * Created by slkk on 2017/10/25.
 */

public class Book implements Serializable {
    public static final long seriid = 123l;
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
