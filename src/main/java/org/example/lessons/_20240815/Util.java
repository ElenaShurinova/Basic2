package org.example.lessons._20240815;

import java.util.Scanner;

public class Util {

        private static Scanner scanner = new Scanner(System.in);


        public static char getOperation() {
            char operation;
            do {
                System.out.println("Введите знак +, -, *, /, %");
                String operationInput = scanner.next();
                operation = operationInput.charAt(0);
            }
            while (operation != operation );
            {
                System.out.println("операция не поддерживается программой.");

            }
            return operation;
        }

        // метод для запроса колл-во чисел
        public static int getCount() {
            int count;
            do {
                System.out.println("Сколько чисел Вы хотите ввести? Разрешено вводить от 2х чисел");
                count = scanner.nextInt();
            }
            while (count < 2);
            return count;
        }

        // метод для получения числа
        public static double getNum(boolean isChek, char operation) {

            double argument;
            if (isChek) {
                do {
                    System.out.println("Введите число: ");
                    argument = scanner.nextDouble();
                }
                while ((operation == '/' || operation == '%') && argument == 0);

            } else {
                System.out.println("Введите число: ");
                argument = scanner.nextDouble();
            }
            return argument;
        }

        public static double getNum() {
            double num;
            System.out.println("Введите число: ");
            num = scanner.nextDouble();
            return num;
        }

        //    метод который выполняет операцию и получает резельтат
        public static double getResalt(double numFirst, double numSecond, char operation) {
            double res = 0;
            switch (operation) {
                case
                    res = numFirst + numSecond;
                    break;
                case
                    res = numFirst - numSecond;
                    break;
                case
                    res = numFirst * numSecond;
                    break;
                case
                    res = numFirst / numSecond;
                    break;
                case
                    res = numFirst % numSecond;
                    break;
            }
            return res;
        }

        public static double getResalt(double arr[], char operation) {
            double res = arr [0];
            for (int i = 1; i < arr.length; i++) {
                switch (operation) {
                    case
                        res += arr[i];
                        break;
                    case
                        res -= arr[i];
                        break;
                    case
                        res *= arr[i];
                        break;
                    case
                        res /= arr[i];
                        break;
                    case
                        res %= arr[i];
                        break;
                }
            }
            return res;
        }

        public static void printResalt(double numFirst, char operation, double numSecond, double res) {
            System.out.println(numFirst + " " + operation + " " + numSecond + " = " + res);
            System.out.printf("%.2f %s %.2f = %.2f", numFirst, operation, numSecond, res);
        }

        public static void printResalt(double arr[], char operation, double res) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append(String.format("%.2f", arr[i]));// добавляем элемент массива в указаном формате
                if (i < arr.length - 1) {
                    stringBuilder.append(operation);
                }
            }
            stringBuilder.append('=');
            stringBuilder.append(String.format("%.2f", res));
            System.out.println(stringBuilder);
        }
    }

