package com.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lvjian on 2017/4/9.
 */
public class StreamLearn {

    private String as = "";

    @Test
    public void testStream1() {

        Stream stream = Stream.of(1, 23, 4);
        String[] strarry = new String[]{"a", "b", "c"};
        Stream<String> strarry1 = Stream.of(strarry);
        List<String> strings = Arrays.asList(strarry);
        Stream<String> stream1 = strings.stream();
        stream1.map(x -> x.split("")).collect(Collectors.toList());
        List<String> filterLists = new ArrayList<>();
        filterLists.add("");
        filterLists.add("a");
        filterLists.add("b");
        filterLists.stream().filter(s -> !s.isEmpty()).forEach(x -> System.out.println(x));


        System.out.println("111111111111111111111111");
        List<String> forEachLists = new ArrayList<>();
        forEachLists.add("a");
        forEachLists.add("b");
        forEachLists.add("c");
        forEachLists.add("d");
        forEachLists.add("e");
        forEachLists.add("f");
        Stream<String> stream2 = forEachLists.stream();
        stream2.skip(2).limit(3).forEach(x -> System.out.println(x));
        stream2.skip(2).limit(3).forEach(x -> System.out.println(x));


    }


    @Test
    public void testMethod1() {
        List<Integer> sortLists = new ArrayList<>();
        sortLists.add(1);
        sortLists.add(4);
        sortLists.add(6);
        sortLists.add(3);
        sortLists.add(2);
        Stream<Integer> stream = sortLists.stream().sorted((int1, int2) -> {
            System.out.println(int1 + "  " + int2);
            return 0;
        });
        System.out.println("after 排序后...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        stream.forEach(x -> System.out.println(x));

        Stream.of(sortLists.toArray()).forEach(x -> System.out.print(x + "  "));
        System.out.println();
        Arrays.sort(sortLists.toArray(), new
                Comparator<Object>() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        System.out.println("o1=" + o1 + "  o2=" + o2);
                        return (Integer) o1 - (Integer) o2;
                    }
                });


    }

    @Test
    public void testMethod3() {
        List<String> maxLists = new ArrayList<>();
        maxLists.add("a");
        maxLists.add("b");
        maxLists.add("c");
        maxLists.add("d");
        maxLists.add("e");
        maxLists.add("f");
        maxLists.add("hahaha");
        System.out.println(maxLists.stream().mapToInt(s -> s.length()).max().getAsInt());
        List<String> distinctList = new ArrayList<>();
        distinctList.add("a");
        distinctList.add("a");
        distinctList.add("c");
        distinctList.add("d");
        distinctList.stream().distinct().forEach(x -> System.out.println(x));
    }


    @Test
    public void testMethod4() {
        List<String> matchList = new ArrayList<>();
        matchList.add("a");
        matchList.add("a");
        matchList.add("c");
        matchList.add("d");
        System.out.println(matchList.stream().anyMatch(x -> x.equals("c")));
        System.out.println(matchList.stream().allMatch(x -> !x.isEmpty()));
        System.out.println(matchList.stream().noneMatch(x -> x.contains("a")));
    }
}
