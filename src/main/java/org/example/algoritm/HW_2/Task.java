package org.example.algoritm.HW_2;

public class Task {

    public class Task1 {
        public static void main(String[] args) {
            int n = 10; // Пример значения n

            if (n == 1) return;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                    break; // Немедленный выход из внутреннего цикла
                }
            }
        }
    }


    public class Task2 {
        public static void main(String[] args) {
            int n = 10; // Пример значения n
            int a = 0;

            for (int i = n / 2; i <= n; i++) {
                for (int j = 2; j <= n; j *= 2) {
                    a = a + n / 2;
                }
            }
        }
    }


    public class Task3 {
        public static void main(String[] args) {
            int n = 10; // Пример значения n
            int a = 0;

            for (int i = 0; i < n; i++) {
                for (int j = n; j > i; j--) {
                    a = a + i + j;
                }
            }
        }
    }


    public class Task4 {
        public static void main(String[] args) {
            int n = 10; // Пример значения n
            int a = 0;
            int i = n;

            while (i > 0) {
                a = a + i;
                i = i / 2;
            }
        }
    }
}
