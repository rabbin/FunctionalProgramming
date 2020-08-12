package com.rabbin.funtionalprogramming.gof;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.stream.Stream;

public class Responsibility {
    public static void main(String[] args) {
        String test = "Rabbin";
        String result = Stream.<Function<String, String>>of(String::toLowerCase, text -> LocalDateTime.now().toString() + " " + text).map(function -> function.apply(test)).findFirst().get();
        System.out.println(result);
    }
}
