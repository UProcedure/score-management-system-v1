package com.weimin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Teacher implements Serializable {
    private Long id;

    private String teacherId;

    private String name;

    private String sex;

    /**
     * 职称（助教、讲师、副教授、教授）
     */
    private String title;

    /**
     * 学位（硕士、博士）
     */
    private String degree;

    private String phone;

    private String email;

    private String college;

    private String info;

    /**
     * 1代表在职，0代表离职
     */
    private Byte status;

    private Date addTime;

    private Date leaveTime;

    private static final long serialVersionUID = 1L;
}