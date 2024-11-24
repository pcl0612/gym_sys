package com.example.gym_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.gym_sys.mapper")
public class GymSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymSysApplication.class, args);
    }

}
