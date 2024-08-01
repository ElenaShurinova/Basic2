package org.example.lessons._20240805;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        long startFor = System.nanoTime();
        System.out.println(factorialFor(num));
        long endFor = System.nanoTime();
        System.out.println("For - " + (endFor - startFor) + " ns\n");
        long startRec = System.nanoTime();
        System.out.println(factorialRecursion(num));
        long endRec = System.nanoTime();
        System.out.println("Rec - " + (endRec - startRec) + " ns\n");
    }
    public static long factorialRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialRecursion(n - 1);
    }
    public static long factorialFor(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
//            fact *= i;
            fact = fact * i;
        }
        return fact;
    }
}
