package com.example.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

public class Product {

    @JSONField(name = "productName")
    private String productName;
    private String desc;
    private String price;

    @JSONField(name = "name")
    public String getProductName() {
        return productName;
    }

    @JSONField(name = "NAME")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JSONField(name = "descHAH")
    public String getDesc() {
        return desc;
    }

    @JSONField(name = "DESC")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JSONField(name = "priceGet")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }
}