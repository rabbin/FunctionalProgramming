package com.rabbin.funtionalprogramming.gof;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Builder {
    public static void main(String[] args) {
        Supplier<Person> getPerson = Person::new;
        Person person = getPerson.get();
        System.out.println(person.getName());

        BiConsumer<Person, String> changePersonName = Person::setName;
        changePersonName.accept(person, "rabbin");

        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
