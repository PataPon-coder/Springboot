package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvjian on 2017/3/26.
 */
@RestController
@RequestMapping("/class")
public class NewClass {

    @RequestMapping("/newClass")
    public String newMethod() {
        return "this is a new method";
    }
}
