package org.example.lessons._20240712;

public class Cat {
    String name;
    int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String info() {
        return "Кот " + name + " имеет возраст = " + age + " лет";
    }
}


