package org.example.algoritm.HW1009;

public class Fibonacci {
    public static class FibonacciRecursive {

        public static void main(String[] args) {
            for (int i = 1; i <= 11; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        public static int fibonacci(int n) {
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
