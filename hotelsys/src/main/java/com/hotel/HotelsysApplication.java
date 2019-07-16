package com.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hotel.dao")
public class HotelsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelsysApplication.class, args);
    }

}
