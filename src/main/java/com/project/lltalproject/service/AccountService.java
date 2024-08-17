package com.project.lltalproject.service;

import com.project.lltalproject.dto.account.request.AccountEditPasswordRequestDto;
import com.project.lltalproject.entity.user.User;
import com.project.lltalproject.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return  userMapper.findUserByUsername(authentication.getName());
    }

    public void editPassword(AccountEditPasswordRequestDto accountEditPasswordRequetDto)
}
