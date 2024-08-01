package org.example.homeworks.HW5;

import java.util.Scanner;

public class SumDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();

        // Нахождение суммы цифр
        int sum = calculateDigitSum(number);
        System.out.println("Сумма всех цифр числа: " + sum);

        scanner.close();
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        // Вычисление суммы цифр числа
        while (number > 0) {
            sum += number % 10;  // Добавляем последнюю цифру к сумме
            number /= 10;        // Убираем последнюю цифру
        }

        return sum;
    }
    }

