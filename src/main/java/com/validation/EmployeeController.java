package com.validation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by lvjian on 2017/4/12.
 */
@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public void testMethod1(Employee employee) {

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(employee.getBirth()));
        System.out.println(employee.getSalary());
    }
}
