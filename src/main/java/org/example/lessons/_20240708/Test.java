package org.example.lessons._20240708;

public class Test {
    public static void main(String[] args) {
        Cat name = new Cat();
        System.out.println(name.getName());
        System.out.println(name.getAge());
        System.out.println();
        Cat name1 = new Cat( "Grei");
        System.out.println(name1.getName());
        System.out.println(name1.getAge());
        System.out.println();
        Cat age1 = new Cat(8);
        System.out.println(name1.getName());
        System.out.println(name1.getAge());

    }
}
