package org.example.homeworks.hw4;
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//
//
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.
public class Ten {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;

        double num1 = Math.abs(m - 10);
        double num2 = Math.abs(n - 10);

        if (num1 < num2) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (num2 < num1) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Оба числа равноудалены к 10.");

        }


    }
}

