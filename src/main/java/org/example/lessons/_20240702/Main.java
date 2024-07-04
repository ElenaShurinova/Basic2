package org.example.lessons._20240702;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = 10;
        char ch1 ='a';
        Character ch2 = 'a';
        float f1 = 1.3f;
        Float f2 = 1.5f;
        double d1 = 1.45;
        long l1 =1000;
        Long l2 = 10000L;

        System.out.println(i2);

        String Language = "java";
        Dog spike = new Dog();
        System.out.println(spike.name);
        System.out.println(spike.age);
        System.out.println(Language);
        System.out.println(StaticClass.PI);


    }
}
