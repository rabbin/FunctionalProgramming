package com.rabbin.funtionalprogramming.gof;

import java.util.Optional;

public class Adaptor {
    public static void main(String[] args) {
        Optional.of(new PS2Device()).map(device -> new USBDevice()).get();
    }
}

class PS2Device{}

class USBDevice{}