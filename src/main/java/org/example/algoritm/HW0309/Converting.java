package org.example.algoritm.HW0309;

public class Converting {
    public class Example {
        private static int funRecursion(int x, int y) {
            if (x == 0) { // Если x равен 0, возвращаем y
                return y;
            } else {
                int res = funRecursion(x - 1, x + y); // Рекурсивный вызов
                System.out.println("res = " + res + "; x = " + x + "; y = " + y);
                return res;
            }
        }

        public static void main(String[] args) {
            System.out.println(funRecursion(5, 3)); // Пример вызова
        }
    }
}
