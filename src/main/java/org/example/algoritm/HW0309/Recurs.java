package org.example.algoritm.HW0309;

public class Recurs {
    public class Factorial {
        // Рекурсивный метод вычисления факториала
        public static int factorialRecursive(int n) {
            if (n == 0 || n == 1) { // Базовый случай: факториал 0 и 1 равен 1
                return 1;
            }
            return n * factorialRecursive(n - 1); // Рекурсия: умножаем число на факториал предыдущего числа
        }

        public static void main(String[] args) {
            int n = 5; // Пример: факториал 5
            System.out.println("Факториал " + n + " (рекурсивно): " + factorialRecursive(n));
        }
    }
}

