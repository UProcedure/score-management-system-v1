package com.weimin.centerweb.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author weimin
 * @ClassName ClassTime
 * @Description TODO
 * @date 2019/12/12 21:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassTime {
    private Integer week;
    private Integer start_time;
    private Integer class_len;
}
