package com.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by lvjian on 2017/4/10.
 */
@Configuration
public class MyBatisConfiguration {

    @Bean
    public PageHelper pageHelper() {
        System.out.println("MybatisConfiguration.pageHelper");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
