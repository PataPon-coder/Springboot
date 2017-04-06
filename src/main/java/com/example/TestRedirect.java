package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;
import java.util.Objects;

/**
 * Created by lvjian on 2017/3/31.
 */
@Controller
@SessionAttributes(value = "test1", types = {String.class, Integer.class})
public class TestRedirect {

    @RequestMapping("/method1")
    public ModelAndView method1(RedirectAttributes attributes) {

        System.err.println("this is method1");
        attributes.addAttribute("param", "1000");
        return new ModelAndView("redirect:/method2");
    }

    @RequestMapping("/method2")
    public String method2(@RequestParam("param") String param, @ModelAttribute("form") String id) {
        System.out.println(param);
        System.err.println("this is method2");
        return "hah";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("user2") User user, Model model) {
        user.setUserName("U love me");
        return "result";
    }

//    @ModelAttribute("user")
//    public User addUser(User user, Model model) {
//        user.setUserName("first in");
//        System.out.println("111111111");
//        return new User("520", "I love U");
//    }


    @RequestMapping("/success")
    public String success(Model model, User user) {
//        map.put("string1","this is a string");
//        map.put("integer1",1888);
//        map.put("test1",true);
        model.addAttribute("string1", "this is a string");
        model.addAttribute("integer1", "this is a string");
        model.addAttribute("string1", "this is a string");
        user.setId("1111");
        user.setUserName("lvjian");
        return "success";
    }


    @RequestMapping("/testpojo")
    private String testPojo(User user) {
        //http://localhost:8080/testpojo?id=100&userName=lvjian&address.city=fuyang&address.province=anhui
        System.out.println(user);
        return "success";
    }


    @RequestMapping("/testRequestHeader")
    private String testRequestHeader(@RequestHeader("Cookie") String sessionId) {
        System.out.println(sessionId);
        return "success";
    }
}
