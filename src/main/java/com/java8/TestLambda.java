package com.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

/**
 * Created by lvjian on 2017/4/7.
 */
public class TestLambda {


    @Test
    public void lambda1() {
        int a = 1;
        Runnable r = () -> {
            System.out.println("用lambda实现runnable接口");
            System.out.println(a);
        };
        r.run();
    }


    @Test
    public void lambda2() throws ExecutionException {
        new Action() {

            @Override
            public void execute(String content) {
                System.out.println(content);
            }
        }.execute("jdk1.8之前的匿名内部类实现方式");

        Action action=     (String content)->{
            System.out.println(content);
        };
        action.execute("jdk1.8的lambda表达式");
        action.ko();
    }


    @Test
    public  void lambda3(){
        String []datas = new String[] {"peng","zhao","li"};

        Arrays.sort(datas,(v1 , v2) -> Integer.compare(v1.length(), v2.length()));
        Arrays.sort(datas,String::compareToIgnoreCase);
        Stream.of(datas).forEach(System.out::println);
        Action.loging();



    }

    @Test
    public  void  lambda4(){
        String []datas = new String[] {"peng","Zhao","li"};
        String ctx="";
        new Thread(()-> {System.out.println(datas);
            System.out.println(this.toString());}).start();
    }

    @Test
    public  void aVoid(){
        String str = "test";
        Stream.of(str).map(String::new);
    }
    @FunctionalInterface()
    interface Action  {
        static void  loging(){
            System.out.println("logging...");
        }
        default  void ko(){
            System.out.println("-ko-----ko--");
        }

        boolean equals(Object a);
        void execute(String content) throws ExecutionException;
    }
}
