package com.java8;

/**
 * Created by lvjian on 2017/4/8.
 * 函数式接口只有一个抽象方法，也可以有公共静态方法，也可以有其他抽象方法，这些方法只能是object类已有的方法
 * 接口还可以方法的默认实现
 */
@FunctionalInterface
public interface Print<T> {
    public  void print(T t);
}


