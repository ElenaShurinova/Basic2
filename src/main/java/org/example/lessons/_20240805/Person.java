package org.example.lessons._20240805;

public class Person {
    //    properties/ variables
    private String name;
    private int age;
    //    default constructor
//    public Person() {}
//    name - constructor
//    public Person(String name) {
//        this.name = name;
//    }
// age - constructor
//    public Person(int age) /*throws Exception*/ {
//        if (age < 0) {
////            throw new Exception("Incorrect age!");
//            System.out.println("Incorrect age!");
//        } else {
//            this.age = age;
//        }
//    }
//    full params constructor
    public Person(String name, int age) {
        this.name = name;
        if (age < 0) {
            System.out.println("Incorrect age!");
        } else {
            this.age = age;
        }
    }
    //    public void setAge(int age) {
//        if (age < 0) {
//            System.out.println("Incorrect age!");
//        } else {
//            this.age = age;
//        }
//    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
