package com.project.lltalproject.jwt;

import com.project.lltalproject.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;

@Component
public class JwtProvider {
    private final Key key;
    public UserMapper userMapper;

    public JwtProvider(@Value("${jwt.secret}") String secret, @Autowired UserMapper userMapper) {}
        key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
        this.UserMapper = userMapper;

}
