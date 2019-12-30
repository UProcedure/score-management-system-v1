package com.weimin.controller;

/**
 * @author weimin
 * @ClassName User
 * @Description TODO
 * @date 2019/12/13 10:07
 */

public class User {
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public User(String test) {
        this.test = test;
    }

    private String test;
}
