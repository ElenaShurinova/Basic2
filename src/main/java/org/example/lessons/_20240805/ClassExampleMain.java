package org.example.lessons._20240805;

public class ClassExampleMain {
    public static void main(String[] args) {
        int i = 10;
        String str = new String("Java");
        Person john = new Person("John", 30);
        Person jane = new Person("Jane", 27);
//        String str = new String("Java");
//        Person person1 = new Person("Alex");
//        Person person = new Person();
////        ..... get data from server
//        person.setAge(30);
//        person.age = -10;
//        person.name = "12312312";
        System.out.println("Your name is " + john.getName()
                + " and your age is " + john.getAge());
        System.out.println("Your name is " + jane.getName()
                + " and your age is " + jane.getAge());
    }
    }

