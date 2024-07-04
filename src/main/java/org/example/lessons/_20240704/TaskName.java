package org.example.lessons._20240704;

import java.util.Scanner;

public class TaskName {
    public static void main(String[] args) {
//        Напишите программу, которая запрашивает имя пользователя и выводит на экран «Добрый день <…….. !>».

//        Улучшите программу, которая запрашивает имя пользователя и выводит на экран
//«Добрый день  <…….. !>».
//«Ваше имя начинается с символа <.> и заканчивается на символ <.>»
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.next();
        System.out.println("hello " + name );
        System.out.println("Your name start width " + name.charAt(0));
        System.out.println("Your name ends width " + name.charAt(name.length() - 1));


    }
}
