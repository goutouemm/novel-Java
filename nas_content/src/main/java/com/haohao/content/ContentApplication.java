package com.haohao.content;

import entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = ("com.haohao.content.dao"))
@EnableDiscoveryClient
@EnableFeignClients // 开启Feign的客户端
public class ContentApplication {

    /**
     * 启动方法
     */
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class,args);
    }

    /**
     * IdWorker
     * @return
     */
    public IdWorker idWorker(){
        return new IdWorker(00,0);
    }


}
