package com.haohao.user;

import entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = ("com.haohao.user.dao"))
@EnableDiscoveryClient
public class UserApplication {

    /**
     * 启动方法
     */
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }

    /**
     * IdWorker
     * @return
     */
    public IdWorker idWorker(){
        return new IdWorker(00,0);
    }


}
