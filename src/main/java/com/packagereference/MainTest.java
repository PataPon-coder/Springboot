package com.packagereference;

import java.util.Arrays;

/**
 * Created by lvjian on 2017/4/12.
 */
public class MainTest {

    public static void main(String[] args) {
        Person [] persons = new Person[10];
        Arrays.sort(persons,Person::compareByAge);
//        Arrays.sort(persons, (o1, o2) -> o1.birthday.compareTo(o2.birthday));
    }
}
