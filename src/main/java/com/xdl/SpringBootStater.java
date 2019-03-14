package com.xdl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = {"com.xdl.mapper"})
@EnableDiscoveryClient
public class SpringBootStater {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStater.class,args);
    }
}
