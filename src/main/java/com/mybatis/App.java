package com.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lvjian on 2017/4/10.
 */
@SpringBootApplication
@MapperScan("com.mybatis.*Mapper")//扫描该包下的class,主要是Mybatis的持久化类
@ComponentScan("com")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
