package com.rabbin.funtionalprogramming.gof;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Command {
    public static void main(String[] args) {
        List<Consumer<String>> taskList = Arrays.asList(System.out::println, text -> System.out.println(LocalDateTime.now() + " " + text));
        String rabbin = "rabbin";
        taskList.forEach(consumer -> consumer.accept(rabbin));
    }
}
