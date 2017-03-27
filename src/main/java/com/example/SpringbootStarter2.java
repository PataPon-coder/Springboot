package com.example;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * fastjson的第二种使用方式
 */
//@SpringBootApplication
public class SpringbootStarter2 {


    public static void main(String[] args) {
        System.setProperty("spring.http.encoding.force", "true");
        SpringApplication.run(SpringbootStarter2.class, args);
    }


    /**
     * 1.需要先定义一个convert，转换消息的对象
     * 2.添加fastjson的配置信息，比如，是否要格式化返回的json数据
     * 3.在convert中添加配置信息
     * 4.将convert添加到converts当中
     */

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        HttpMessageConverter converter = fastJsonConverter;
        return new HttpMessageConverters(converter);
    }

}
