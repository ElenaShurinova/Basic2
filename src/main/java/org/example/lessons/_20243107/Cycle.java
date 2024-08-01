package org.example.lessons._20243107;

public class Cycle {
    public static void main(String[] args) {
//        Реализуйте метод, принимающий в параметре число.
//Распечатайте все входящие значения числа
//
//Например: 
//Вход = 8
//Выход = 
//1
//2
//3
//…
//8

        for (int i = 0; i < 9; i++)
            System.out.println(i);

        printNumbers(15);
    }

    public static void printNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}

//Написать метод, который принимает число и
// печатает только четный числа.

//printNumbers(14);
//}
//public static void printNumbers(int num){
//    for (int i = 1; i <= num ; i++){
//        if (i % 2 == 0) {
//            System.out.println(i);
//        }
//
//    }





