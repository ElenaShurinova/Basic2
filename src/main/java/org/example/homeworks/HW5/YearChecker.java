package org.example.homeworks.HW5;

import java.util.Scanner;

public class YearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        // Проверка на високосный год
        if (isLeapYear(year)) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // Условие для определения високосного года
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

