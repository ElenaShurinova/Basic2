package org.example.homeworks.HW7;

public class Random {
//            1. Создайте массив из 5 случайных чисел в интервале [10;99].
//            2. Выведите его на консоль в строку.
//            3. Определите, является ли массив строго возрастающей последовательностью.




        public static void main(String[] args) {
            java.util.Random rand = new java.util.Random();
            int[] array2 = new int[5];

            // Создание массива
            for (int i = 0; i < array2.length; i++) {
                array2[i] = rand.nextInt(90) + 10;
            }

            //  Вывод массива на консоль
            System.out.print("Массив: ");
            for (int num : array2) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Проверка, является ли массив строго возрастающей последовательностью
            boolean sequence = true;
            for (int i = 1; i < array2.length; i++) {
                if (array2[i] <= array2[i - 1]) {
                    sequence = false;
                    break;
                }
            }

            // Вывод результата проверки
            if (sequence) {
                System.out.println("Массив является строго возрастающей последовательностью.");
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью.");
            }
        }
    }

