package com.rabbin.funtionalprogramming.gof;

import java.util.function.Supplier;

public enum EnumSingleton {
    SINGLETON;

    public static Supplier<EnumSingleton> getInstance() {
        return () -> EnumSingleton.SINGLETON;
    }

    public void doSomething() {
        System.out.println("something is done!");
    }

    public static void main(String[] args) {
        EnumSingleton.getInstance().get().doSomething();
        Singleton.getInstance().get().doSomething();
        StaticInnerSingleton.getInstance().get().doSomething();
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    static Supplier<Singleton> getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return () -> instance;
    }

    void doSomething() {
        System.out.println("something is done!");
    }
}

class StaticInnerSingleton {
    private StaticInnerSingleton instance;

    private StaticInnerSingleton() {
    }

    static Supplier<StaticInnerSingleton> getInstance() {
        return () -> SingletonHolder.instance;
    }

    void doSomething() {
        System.out.println("something is done!");
    }

    private static class SingletonHolder {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

}
