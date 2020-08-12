package com.rabbin.funtionalprogramming.gof;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class Interpreter {
    public static void main(String[] args) {
        Map<String, IntBinaryOperator> operatorMap = new HashMap<>();
        operatorMap.put("+", Integer::sum);
        operatorMap.put("-", (x, y) -> x - y);

        String result = Arrays.stream("4 5 + 6 -".split(" ")).reduce("0 ", (acc, x) -> {
            if (operatorMap.containsKey(x)) {
                String[] split = acc.split(" ");
                System.out.println(acc);
                acc = split[0] + " " + operatorMap.get(x).applyAsInt(Integer.parseInt(split[1]), Integer.parseInt(split[2])) + " ";
            } else {
                acc = acc + x + " ";
            }
            return acc;
        });
        System.out.println(result);
    }
}
