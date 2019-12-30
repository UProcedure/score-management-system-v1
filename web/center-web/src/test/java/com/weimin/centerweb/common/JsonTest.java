package com.weimin.centerweb.common;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.weimin.centerweb.common.entity.ClassTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author weimin
 * @ClassName JsonTest
 * @Description TODO
 * @date 2019/12/12 21:15
 */
public class JsonTest {
    public static void main(String[] args) {
        List<ClassTime> list = new ArrayList<>();
        list.add(new ClassTime(1,1,2));
        list.add(new ClassTime(3,3,2));
        System.out.println(JSONUtil.toJsonStr(list));
        String js = "[{\"start_time\":1,\"week\":1,\"class_len\":2},{\"start_time\":3,\"week\":3,\"class_len\":2}]";
        List<ClassTime> list1 = JSONUtil.toList(JSONUtil.parseArray(js), ClassTime.class);
        list1.forEach((v)-> System.out.println(v));
    }
}
