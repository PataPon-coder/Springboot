package com.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by lvjian on 2017/4/8.
 */
public class StreamTest {

    static class Person {
        private String name;
        private String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

    @Test
    public void streamTest() {

        String arrs[] = new String[]{"吕健", "杨慧", "宝宝"};
        List<Person> list = new ArrayList<Person>();
        Person [] persons=new Person[]{};
        list.add(new Person("吕健", "25"));
        list.add(new Person("杨慧", "223"));
        list.add(new Person("宝宝", "1"));
        Stream<Person> stream = list.stream();
//        stream.filter(x->x.getName().equals("")).forEach(p-> System.out.println(p));
        double doa= stream.mapToDouble(item->{System.out.println("a");return  100.1;}).average().getAsDouble();
//                .forEach(p-> System.out.println(p));
        System.out.println(doa);
    }
}
