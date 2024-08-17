package com.project.lltalproject.repository;

import com.project.lltalproject.entity.user.Oauth2;
import com.project.lltalproject.entity.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User findUserByUsername(String username);
    public User findUserByNickname(String nickname);
    public User findUserByOAuth2name(String oAuth2name);
    public int saveUser(User user);
    public int saveRole(@Param("userId") int userId, @Param("roleId") int roleId);
    public int saveOAuth2(Oauth2 oauth2);
    public int editPassword(User user);
    public int editNickname(User user);
    public int updateProfileImageUrl(User user);
}
