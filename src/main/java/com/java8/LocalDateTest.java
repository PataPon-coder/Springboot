package com.java8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by lvjian on 2017/4/8.
 */
public class LocalDateTest {

    @Test
    public void testMethod1() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2017, 3, 7);
        System.out.println(localDate1);
    }


    @Test
    public void testMethod2() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime);
    }


    @Test
    public void testMethod3() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
        System.out.println(localDateTime);
    }

    @Test
    public void testMethod4() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("2014-04-01 13:24:01", dateTimeFormatter);
        System.out.println(localDateTime);
    }


    @Test
    public void testMethod5() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(simpleDateFormat.parse("2017-04-08 25:02:42"));

        ZonedDateTime dateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }

    @Test
    public void testMethod6() {
        LocalDate localDate = LocalDate.of(2017, 4, 9);
        MonthDay monthDay = MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
        if (monthDay.equals(currentMonthDay)) {
            System.out.println("happy birthday");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }

        String s1 = new String("a");
        String s2 = "a";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }


    @Test
    public void testMethod7() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusMonths(2));
        LocalDateTime localDateTime = localDate.atTime(11, 25);
        System.out.println("this is localDateTime=" + localDateTime);
        System.out.println(localDate.plus(1, ChronoUnit.MONTHS));
        /* 一年前的日期
        * */
        System.out.println(localDate.minus(1, ChronoUnit.YEARS));
    }

    @Test
    public void testMethod8() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
        System.out.println(clock.millis() == System.currentTimeMillis());
        System.out.println(clock.instant());
        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.getZone());
        System.out.println(clock1.millis() == System.currentTimeMillis());
        System.out.println(clock1.instant());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now(clock));
        System.out.println(LocalTime.now(clock));
        LocalDateTime.now();
        System.out.println(TimeZone.getDefault());
    }

    @Test
    public void testMethod9() {
        System.out.println(LocalDate.of(2000, 12, 2).isLeapYear());

        LocalDate localDate = LocalDate.now();
        Period period = Period.between(localDate, LocalDate.of(2017, 4, 10));
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.getYears());
        period.getUnits().forEach(x -> System.out.println(1));
        System.out.println(Instant.now());
        System.out.println(Date.from(Instant.now()));


        System.out.println(Instant.now());
        System.out.println(Instant.now().atOffset(ZoneOffset.ofHours(8)));
    }

    @Test
    public void testMethod10() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timeStr = "2017-04-09 14:50:32";
        LocalDate localDate = LocalDate.parse(timeStr, dateTimeFormatter);
        System.out.println(localDate);
    }
}
