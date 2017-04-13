package com.java8;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        Person[] persons = new Person[]{};
        list.add(new Person("吕健", "25"));
        list.add(new Person("杨慧", "223"));
        list.add(new Person("宝宝", "1"));
        Stream<Person> stream = list.stream();
//        stream.filter(x->x.getName().equals("")).forEach(p-> System.out.println(p));
        double doa = stream.mapToDouble(item -> {
            System.out.println("a");
            return 100.1;
        }).average().getAsDouble();
//                .forEach(p-> System.out.println(p));
        System.out.println(doa);
    }


    @Test
    public void testMethod10() {
        Stream<Double> stream = Stream.generate(() -> Math.random());
//        System.out.println(stream.limit(100));
        stream.limit(10).forEach(x -> System.out.println(x));

        Stream.iterate(1, item -> {
            System.out.println(item);
            return item + 2;
        }).limit(10).forEach(x -> System.out.println(x));
    }

    @Test
    public void testMethod11() {
        IntStream intStream = Stream.of(1, 2, 3, 4).mapToInt(x -> x);
        Stream.of(1, 2, 3, 4).flatMap(x -> Stream.of(x, 100)).forEach(x -> System.out.println(x));

        System.out.println("================");
        System.out.println("================");
        System.out.println("================");
        intStream.forEach(x -> {
        });
    }

    @Test
    public void testMethod12() {
        List<Integer> nums = Lists.newArrayList(1, 2, 3, 4);
        System.out.println("sum is: " + nums.stream().filter(num -> {
            System.out.println("filter in :" + num);
            return num != null;
        }).
                distinct().mapToInt(num -> {
            System.out.println("mapToInt in :" + num);
            return num * 2;
        }).
                peek(System.out::println).skip(2).limit(4).sum());

    }

    @Test
    public void testMethod13() {
        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
        List<Integer> resultList = nums.stream().collect(
                () -> Lists.newArrayList(),
                (list, item) -> list.add(item), (list1, list2) -> list1.addAll(list2));

        System.out.println(1);
        resultList.stream().peek(x -> System.out.println("peek in:" + x)).forEach(x -> {
        });
        List<Integer> numsWithoutNull = resultList.stream().collect(Collectors.toList());

    }

    @Test
    public void testMethod14() {
        List<Integer> ints = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints.stream().reduce((sum, item) -> {

            return sum + item;
        }).get();
//        System.out.println(Optional.ofNullable(null).orElseGet(()->"a"));
//        Optional.of(null);
        System.out.println(Optional.fromNullable(null).or("a"));
    }

    @Test
    public void testMethod15() {
        List<Integer> ints = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("ints sum is:" + ints.stream().reduce(0, (sum, item) -> {
            System.out.println(sum);
            return sum + item;
        }));
    }
}
