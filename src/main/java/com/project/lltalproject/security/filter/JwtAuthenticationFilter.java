package com.project.lltalproject.security.filter;

import com.project.lltalproject.jwt.JwtProvider;
import jakarta.servlet.GenericFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationFilter extends GenericFilter {
    @Autowired
    private JwtProvider jwtProvider;

}
