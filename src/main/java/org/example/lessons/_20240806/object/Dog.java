package org.example.lessons._20240806.object;


public class Dog {
    private String name;
    private int age;
    private String color;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public void run() {
        System.out.println(this.name + " is running...");
//        return "The dog is running...";
    }
    public void eat() {
        System.out.println(this.name +  " is eating...");
    }
    public void sleep() {
        System.out.println(this.name +  " is sleeping...");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
