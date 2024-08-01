package org.example.lessons._20240806.object;

import java.util.Objects;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name is " + name;
    }

    @Override
    public boolean equals(Object o) {

        return this == o;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}