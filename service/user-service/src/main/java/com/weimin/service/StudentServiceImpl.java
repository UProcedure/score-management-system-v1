package com.weimin.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.weimin.api.IStudentService;
import com.weimin.base.BaseServiceImpl;
import com.weimin.base.IBaseDao;
import com.weimin.entity.Student;
import com.weimin.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author weimin
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @date 2019/12/12 11:30
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public IBaseDao<Student> getBaseDao() {
        return studentMapper;
    }


}
