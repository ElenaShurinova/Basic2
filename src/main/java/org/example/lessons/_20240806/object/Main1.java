package org.example.lessons._20240806.object;

public class Main1 {
    public static void main(String[] args) {
        Person bob = new Person ("Bob");
        Person ivan = new Person ("Ivan");
        System.out.println(bob);
        System.out.println(ivan);
        System.out.println(bob.equals(ivan));
        Object obj = new Object();
        System.out.println(bob.equals(obj));

    }
}
