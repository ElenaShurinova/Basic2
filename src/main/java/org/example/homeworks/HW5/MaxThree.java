package org.example.homeworks.HW5;

import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Нахождение максимума из трех чисел
        int max = findMax(num1, num2, num3);
        System.out.println("Максимальное из введённых чисел: " + max);

        scanner.close();
    }

    public static int findMax(int a, int b, int c) {
        // Используем Math.max для нахождения максимума
        return Math.max(a, Math.max(b, c));
    }
}
