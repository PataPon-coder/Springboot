package com.example.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

public class Person {

    @JSONField(name = "name1",label = "")
    private String name;

    @JSONField(name = "age1")
    private String age;

    @JSONField(name = "desc1")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNAME(String NAME) {
        this.name = NAME;
    }

    public void setAGE(String AGE) {
        this.age = AGE;
    }

    public void setDESC(String DESC) {
        this.desc = DESC;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }
} 