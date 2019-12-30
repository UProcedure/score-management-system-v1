package com.weimin.auditiondemo.entity;

/**
 * @author weimin
 */

public enum DaoEnum {
    /**
     *
     */
    DAO_ENUM(1),DAO_ENUM2(2);
    private Student student;
    private int a;
    DaoEnum(int a){
        this.a=a;
        this.student = new Student();
    }

    public Student initTest(){
        return this.student;
    }
}
