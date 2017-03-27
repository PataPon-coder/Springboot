package com.example.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvjian on 2017/3/23.
 */
public class PersonTest {
    private Person person;

    @Before
    public void setUp() {

    }

    @Test
    public void test() {
        person = new Person();
        person.setName("xianglj");
        person.setAge("20");
        person.setDesc("只是一个测试");
        String jsonStr = JSONObject.toJSONString(person);
        System.out.println("bean to json:" + jsonStr);

        //改变json的key为大写
        jsonStr = jsonStr.toUpperCase();

        System.out.println("需要转换的json:" + jsonStr);
        person = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), Person.class);
        System.out.println("json to bean:" + person.getName());
    }

    @Test
    public void testSetterAndGetter() {
        Product product = new Product();
        product.setProductName("产品");
        product.setDesc("这是一个产品");
        product.setPrice("22.3");

        String jsonStr = JSONObject.toJSONString(product);
        System.out.println("转换为json:" + JSONObject.toJSONString(product));

        //jsonStr = jsonStr.toUpperCase();
        System.out.println(JSONObject.parseObject(jsonStr));

        product = JSONObject.toJavaObject(JSONObject.parseObject("{\"DESC\":\"这是一个产品\",\"PRICE\":\"22.3\",\"NAME\":\"产品\"}"), Product.class);
        System.out.println(product.toString());
    }

    @Test
    public void NullControl() {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("a", 1);
        jsonMap.put("b", "");
        jsonMap.put("c", null);
        jsonMap.put("d", "wuzhuti.cn");

        String str = JSONObject.toJSONString(jsonMap, SerializerFeature.WriteMapNullValue);
        System.out.println(str);
//输出结果:{"a":1,"b":"",d:"wuzhuti.cn"}
    }
}
