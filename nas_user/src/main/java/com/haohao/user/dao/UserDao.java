package com.haohao.user.dao;

import com.domain.user.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User> {

    @Select("SELECT * from user where username = #{username}")
    public User selectUserByName(String username);

}
