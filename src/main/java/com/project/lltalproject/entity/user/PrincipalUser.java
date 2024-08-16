package com.project.lltalproject.entity.user;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Builder
@Data
public class PrincipalUser implements UserDetails {

    private int userId;
    private String username;
    private String password;
    private String name;
    private String address;
    private String detailAddress;
    private String phoneNumber;
    private String email;
    private String profileImageUrl;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public String getPass

}
