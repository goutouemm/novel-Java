package com.haohao.content.service;

import com.domain.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nas-user")
public interface UserService {

    @RequestMapping("/user/{uid}")
    User findByUid(@PathVariable Long id);

}
