package com.domain.novel;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "novels")
public class Novel implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)//自动增长
    private Long id;
    private String name;
    private String img;
    private String label;
    private String content;

}
