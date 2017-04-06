package com.example;

/**
 * Created by lvjian on 2017/3/31.
 */
public class User {
    private String id;
    private String userName;
    public String age = "18";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
        System.out.println("调用了无参构造");
    }

    public User(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id='" + id + '\'' +
                ", address=" + address +
                '}';
    }

    private  Address address;

}
