package com.project.lltalproject.config;


import com.project.lltalproject.security.exception.AuthEntryPoint;
import com.project.lltalproject.security.filter.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;
    @Autowired
    private AuthEntryPoint authEntryPoint;
    @Autowired
    private OAuth2PrincipalUserService oAuth2PrincipalUserService;
    @Autowired
    private OAuth2Suc



   @Bean
   public BCryptPasswordEncoder passwordEncoder() { return  new BCryptPasswordEncoder(); }


    @Override
    protected  void configure(HttpSecurity http) throws  Exception {
        http.cors();
        http.csrf().disable();
        http.authorizeHttpRequests()
                .

    }



}



