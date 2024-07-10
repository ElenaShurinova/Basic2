package org.example.homeworks.HW3;


import java.util.Scanner;

public class ArithmeticOperations {




        // Метод для сложения
        public static double add(double a, double b) {
            return a + b;
        }

        // Метод для вычитания
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Метод для умножения
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Метод для деления
        public static double divide(double a, double b) {
            return a / b;
        }

        // Метод для конвертации евро в доллары
        public static double convertToUSD(double euros) {
            double exchangeRate = 1.1; // Пример обменного курса
            return euros * exchangeRate;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод двух чисел
            System.out.println("Введите первое число:");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число:");
            double num2 = scanner.nextDouble();

            // Вывод результатов арифметических операций
            System.out.println("Сложение: " + add(num1, num2));
            System.out.println("Вычитание: " + subtract(num1, num2));
            System.out.println("Умножение: " + multiply(num1, num2));
            if (num2 != 0) {
                System.out.println("Деление: " + divide(num1, num2));
            } else {
                System.out.println("Деление на ноль невозможно.");
            }

            // Ввод суммы в евро для конвертации
            System.out.println("Введите сумму в евро для конвертации:");
            double euros = scanner.nextDouble();

            // Конвертация евро в доллары и вывод результата
            System.out.println("Сумма в долларах США: " + convertToUSD(euros));

            scanner.close();
        }
    }

