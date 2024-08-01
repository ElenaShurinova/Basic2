package org.example.lessons._20240801;

public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Написать программу, которая выводит таблицу умножения
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + (j * i));
                System.out.println();

            }
        }
    }
}
