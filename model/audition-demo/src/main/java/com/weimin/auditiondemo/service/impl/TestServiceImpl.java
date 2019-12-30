package com.weimin.auditiondemo.service.impl;

import com.weimin.auditiondemo.config.DynamicDataSource;
import com.weimin.auditiondemo.entity.User;
import com.weimin.auditiondemo.mapper.StudentMapper;
import com.weimin.auditiondemo.mapper.UserMapper;
import com.weimin.auditiondemo.service.ITestService;
import com.weimin.auditiondemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weimin
 * @ClassName TestServiceImpl
 * @Description TODO
 * @date 2019/12/14 20:56
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public void test() {
        // TODO 使用默认数据源查询
        System.out.println(userMapper.selectByPrimaryKey(12));
    }

    @Override
    public void test2(){
        try {
            DynamicDataSource.setDataSource("second");
            // TODO 查询编号为二的数据库
            System.out.println(studentMapper.selectByPrimaryKey(1L));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //TODO 结束，修改数据源，将其变回默认数据源
            DynamicDataSource.setDataSource("first");
        }
    }
}
