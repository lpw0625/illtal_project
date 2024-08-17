package com.project.lltalproject.aop;


import com.project.lltalproject.aop.annotation.VaildAspect;
import com.project.lltalproject.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidAop {

    @Autowired
    private UserMapper userMapper;


}
