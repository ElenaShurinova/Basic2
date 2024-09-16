package org.example.algoritm.HW0309;

public class Without_recursion {
    public class Example {
        public static int funIteration(int x, int y) {
            int res = y; // Начинаем с y
            while (x != 0) { // Пока x не равен 0
                res = x + res; // Обновляем res
                System.out.println("res = " + res + "; x = " + x + "; y = " + y);
                x--; // Уменьшаем x
            }
            return res; // Возвращаем результат
        }

        public static void main(String[] args) {
            System.out.println(funIteration(5, 3)); // Пример вызова
        }
    }
}
