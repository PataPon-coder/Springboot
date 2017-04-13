package com.validation;

import org.junit.Test;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by lvjian on 2017/4/12.
 */
public class Employee {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @NumberFormat(pattern = "#,###,###.##")
    private float salary;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Test
    public void test1() {
        Double myNumber = 23323.3323232323;
        Double test = 0.3434;
        String myString = java.text.NumberFormat.getInstance().format(myNumber);
        System.out.println(myString);
        java.text.NumberFormat format = java.text.NumberFormat.getInstance();
        format.setMinimumFractionDigits(3);
        format.setMaximumFractionDigits(5);
        format.setMaximumIntegerDigits(10);
        format.setMinimumIntegerDigits(0);
        System.out.println(format.format(2132323213.23266666666));
    }

    @Test
    public void test2() {
        double pi = 3.1415927;//圆周率
        BigDecimal c = new BigDecimal("2997924585321");//光速
        System.out.println(new DecimalFormat("0").format(pi));//3
        System.out.println(new DecimalFormat("00.000").format(pi));// 03.142
        System.out.println(new DecimalFormat("#").format(pi));//3
        System.out.println(new DecimalFormat("#.##%").format(pi));//314.16%
        System.out.println(new DecimalFormat("00.####E0").format(c));//29.9792E7

        System.out.println(new DecimalFormat(",###").format(c));//299,792,458
        System.out.println(new DecimalFormat("光速大小为每秒,###米。").format(c));

    }
}
