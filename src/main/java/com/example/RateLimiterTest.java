package com.example;

/**
 * Created by lvjian on 2017/3/22.
 */

import com.google.common.util.concurrent.RateLimiter;

public class RateLimiterTest {

    public static void main(String[] args) {

        RateLimiter ratelimiter = RateLimiter.create(2);
        System.out.println(ratelimiter.getRate());
        ratelimiter.setRate(50);
        System.out.println(ratelimiter.getRate());
        System.out.println(ratelimiter.tryAcquire(1));
    }
}
