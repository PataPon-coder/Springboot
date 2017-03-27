package com.engine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvjian on 2017/3/27.
 */
@RestController
public class TestCompile {

    @RequestMapping("/hah")
    public String sayHa() {
        return "hah";
    }
}
