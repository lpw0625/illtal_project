package com.project.lltalproject.controller;


import com.project.lltalproject.entity.user.PrincipalUser;
import com.project.lltalproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/principal")
    public ResponseEntity<?> getPrincipal() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PrincipalUser principalUser = (PrincipalUser)  authentication.getPrincipal();
        return  ResponseEntity.ok(principalUser);
    }
}
