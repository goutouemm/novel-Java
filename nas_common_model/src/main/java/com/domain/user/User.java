package com.domain.user;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "user")
public class User implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)//自动增长
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String state;

}
