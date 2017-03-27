package com.example;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;

/**
 * Created by lvjian on 2017/3/23.
 */

public class Person1 {


    private int age;
    private String name;
    private long salary;

    @JSONField(serialize = false)
    private String remarks;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    public int getAge() {
        return age;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "to String=Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @ControllerAdvice
    public static class GlobalDefaultExceptionHandler {
        @ExceptionHandler(value = Exception.class)
        public void defaultErrorHandler(HttpServletRequest req, Exception e) {

            //打印异常信息：
            e.printStackTrace();
            System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");


        }

        @RequestMapping("/zeroException")
        public void zeroException() {
            int i = 1024 / 0;
        }
    }
}
