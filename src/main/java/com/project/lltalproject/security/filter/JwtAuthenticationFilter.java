package com.project.lltalproject.security.filter;

import com.project.lltalproject.jwt.JwtProvider;
import jakarta.servlet.FilterChain;
import jakarta.servlet.GenericFilter;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

@Component
public class JwtAuthenticationFilter extends GenericFilter {
    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServerException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)  servletResponse;

        List<String> antMatchers = List.of(
                "/auth"
        )
    }

}
