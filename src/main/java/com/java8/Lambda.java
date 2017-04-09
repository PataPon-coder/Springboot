package com.java8;

/**
 * Created by lvjian on 2017/4/8.
 */
public class Lambda {

    public  static  void PrintString(String str,Print<String> print){
        print.print(str);
    }

//    private static  void lambda$main$0(String str){
//
//    }
    public static void main(String[] args) {
        System.setProperty("jdk.internal.lambda.dumpProxyClasses", "C:\\Users\\lvjian\\IdeaProjects\\Springboot2222\\target\\classes\\com\\java8");

        PrintString("test",(x)-> System.out.println(x));
    }
}
