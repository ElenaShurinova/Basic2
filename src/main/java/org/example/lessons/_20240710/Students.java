package org.example.lessons._20240710;

import java.util.Scanner;

//Напишите метод, который принимает на вход количество студентов и “рандомально” выбирает любого студента начиная со второго включительно.
//Например: в зуум сейчас присутствуют 100 участников. Первый участник - это преподаватель. Выбор должен быть сделан из  последующих, т.е. число выбирается из диапазона min-max.

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random min Value");
        int firstNumber = scan.nextInt();
        System.out.println("Enter random max Value");
        int secondNumber = scan.nextInt();

        int result = getRandomStudent(firstNumber, secondNumber);
        System.out.println(result);


        }
    public static int getRandomStudent ( int min, int max){
        int randomValue = (int) (Math.random() * (max - min + 1) + min);
        return randomValue;
    }
}

