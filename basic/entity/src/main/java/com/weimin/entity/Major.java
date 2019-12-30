package com.weimin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Major implements Serializable {
    private Long id;

    private String name;

    private Integer parentId;

    private Byte flag;

    private Date createTime;

    private Date updateTime;

    private Long updateId;

    private static final long serialVersionUID = 1L;
}