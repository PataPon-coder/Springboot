package com.mybatis;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lvjian on 2017/4/10.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    DemoMapper demoMapper;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name) {
        PageHelper.startPage(1,2);
        return demoService.likeName(name);
    }

    @Autowired
    private PageHelper pageHelper;

    @RequestMapping("/insert")
    public void insertDemo(Demo demo) {


        System.out.println(demoMapper.insertByObject(demo));
        System.out.println(demo);
    }

    @RequestMapping("/update")
    public void updateDemo(String myID) {
        System.out.println(myID);
        System.out.println(demoMapper.updateById(myID));
    }
}
