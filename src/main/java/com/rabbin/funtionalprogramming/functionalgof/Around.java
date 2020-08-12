package com.rabbin.funtionalprogramming.functionalgof;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Around {
    public static void measurePerformance(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        System.out.println("It took  " + (System.currentTimeMillis() - start) + " ms");
    }

    public static void main(String[] args) {
        measurePerformance(() -> Stream.of(100000, 200000).map(BigInteger::valueOf).forEach(System.out::println));
    }
}
