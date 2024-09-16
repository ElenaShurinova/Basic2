package org.example.algoritm.HW0309;

public class Inter {
    public class Factorial {
        // Итеративный метод вычисления факториала
        public static int factorialIterative(int n) {
            int result = 1; // Начинаем с 1
            for (int i = 2; i <= n; i++) { // Цикл от 2 до n
                result *= i; // Умножаем результат на текущее число
            }
            return result;
        }

        public static void main(String[] args) {
            int n = 5; // Пример: факториал 5
            System.out.println("Факториал " + n + " (итеративно): " + factorialIterative(n));
        }
    }
}
