package com.example;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * fastjson的第一种使用方式
 */
//@SpringBootApplication
public class SpringbootStarter extends WebMvcConfigurerAdapter {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarter.class, args);
    }


    /**
     * 1.需要先定义一个convert，转换消息的对象
     * 2.添加fastjson的配置信息，比如，是否要格式化返回的json数据
     * 3.在convert中添加配置信息
     * 4.将convert添加到converts当中
     */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//
//        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastJsonConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(fastJsonConverter);
//    }



}
