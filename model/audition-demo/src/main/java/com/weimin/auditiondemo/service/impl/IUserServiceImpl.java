package com.weimin.auditiondemo.service.impl;

import com.weimin.auditiondemo.entity.User;
import com.weimin.auditiondemo.mapper.UserMapper;
import com.weimin.auditiondemo.service.IUserService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author weimin
 * @ClassName IUserServiceImpl
 * @Description TODO
 * @date 2019/12/14 20:30
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    @Transactional
    public String test1(User user) {
        System.out.println(userMapper.insert(new User("zs")));
        try {
            int i = 1/0;
        }catch (Exception e){

        }
//        IUserService o = (IUserServiceImpl)AopContext.currentProxy();
//        o.test2(new User());
        //test2(new User());
        return "ok";
    }

    @Transactional
    public void test3(){
        userMapper.insert(new User("zs"));
    }

    public void test4(){

    }

    @Transactional
    @Override
    public String test2(User user) {
        System.out.println(userMapper.insert(new User("ls")));
        try {
            int i = 1/0;
        }catch (Exception e){

        }
        return "ok";
    }
}
