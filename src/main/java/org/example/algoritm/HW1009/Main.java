package org.example.algoritm.HW1009;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static class FibonacciMemoization {

        private static final Map<Integer, Integer> memo = new HashMap<>();

        public static void main(String[] args) {
            for (int i = 1; i <= 11; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        public static int fibonacci(int n) {
            if (n == 1 || n == 2) {
                return 1;
            }
            if (memo.containsKey(n)) {
                return memo.get(n);
            }
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, result);
            return result;
        }
    }
}
