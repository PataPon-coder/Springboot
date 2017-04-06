package com.example;

/**
 * Created by lvjian on 2017/3/31.
 */
public class Address {
    private  String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    private  String province;

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
