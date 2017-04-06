package com.thymeleaf;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by lvjian on 2017/3/27.
 */
@Controller
public class TemplataControlleer {

    @RequestMapping("/firstTemplate")
    public ModelAndView firstThymeleaf(Map<String, Object> map) {
        map.put("name", "lvjian");
        ModelAndView mv = new ModelAndView("hello", Maps.newConcurrentMap());
        return mv;
    }
}
