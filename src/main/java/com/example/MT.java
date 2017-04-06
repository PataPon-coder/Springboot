package com.example;

import com.example.fastjson.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * Created by lvjian on 2017/3/21.
 */
@RestController
public class MT {

    @RequestMapping("/hi2")
    public String sayHi() {

        return "hello lvjian";
    }

    @RequestMapping(value = "/hiNew",method = RequestMethod.POST)
    private String hiNew() {
        String arr[] = new String[]{};
        System.out.println(arr.length);
        return "hiNew";
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    private Person testResponseBody() {
        Person person = new Person();
        person.setAge("111");
        person.setName("hha");
        person.setDESC("this is desc");
        return person;
    }

    @RequestMapping("/person")
    public Person1 getPerson() {

        Person1 person = new Person1();
        person.setAge(25);

        person.setName("吕健");
        person.setSalary(18000);
        person.setCreateTime(new Timestamp(System.currentTimeMillis()));
        person.setRemarks("这是备注信息");
        return person;
    }

    @RequestMapping("/zeroException")
    public int zeroException() {
        return 100 / 0;
    }

    @RequestMapping("okman")
    public void Ok() {

    }
}
