package com.project.lltalproject.jwt;

import com.project.lltalproject.repository.UserMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtProvider {
    private final Key key;
    public UserMapper userMapper;

    public JwtProvider(@Value("${jwt.}"))




}
