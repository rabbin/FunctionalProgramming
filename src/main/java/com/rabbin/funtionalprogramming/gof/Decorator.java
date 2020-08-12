package com.rabbin.funtionalprogramming.gof;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Decorator {
    public static void main(String[] args) {
        Consumer<String> toAscii = text -> System.out.println("print ASCII:" + text);
        Function<String, String> toHex = text -> text.chars().boxed().map(ch -> "0x" + Integer.toHexString(ch)).collect(Collectors.joining(" "));
        Consumer<String> decoratorToHex = text -> System.out.println("print HEX : " + toHex.apply(text));
        toAscii.andThen(decoratorToHex).accept("text");
    }
}
