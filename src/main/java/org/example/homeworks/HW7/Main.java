package org.example.homeworks.HW7;

import java.util.Random;

//        1. Создайте массив из 8 случайных чисел в интервале [1;50].
//        2. Выведите массив на консоль в строку.
//        3. Замените каждый элемент с нечетным индексом на 0.
//        4. Выведите изменённый массив на консоль в отдельной строке.
public class Main {

        public static void main(String[] args) {
            Random rand = new Random();
            int[] array1 = new int[8];

            //  Создание массива
            for (int i = 0; i < array1.length; i++) {
                array1[i] = rand.nextInt(50) + 1;
            }

            //  Вывод массива на консоль
            System.out.print(" ");
            for (int num : array1) {
                System.out.print(num + " ");
            }
            System.out.println();

            //  Замена элементов с нечетным индексом на 0
            for (int i = 1; i < array1.length; i += 2) {
                array1[i] = 0;
            }

            //  Вывод изменённого массива
            System.out.print(" ");
            for (int num : array1) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

