package com.rabbin.funtionalprogramming.gof;

public class Template {
    private Runnable call1 = () -> {};
    private Runnable call2 = () -> {
        System.out.println("call2");
    };
    private Runnable call3 = () -> {};

    public void setCall1(Runnable call1) {
        this.call1 = call1;
    }

    public void setCall2(Runnable call2) {
        this.call2 = call2;
    }

    public void setCall3(Runnable call3) {
        this.call3 = call3;
    }

    public void run() {
        call1.run();
        call2.run();
        call3.run();
    }

    public static void main(String[] args) {
        Template template = new Template();
        template.setCall1(() -> System.out.println("call1"));
        template.setCall3(() -> System.out.println("call3"));

        template.run();
    }
}
