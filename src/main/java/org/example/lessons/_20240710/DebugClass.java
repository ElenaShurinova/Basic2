package org.example.lessons._20240710;

public class DebugClass {
    public static void main(String[] args) throws Exception {
//        int i = 10;
//        String str = "JS";
        findEvenOdd(2);
//        str = "Java";
        findEvenOdd(4);
        findEvenOdd(5);
//        print();
        div(10, 2);
    }

    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void print() {
        System.out.println("Hello from print.");
    }

    public static void div(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Division by zero");
        }
        System.out.println(num1 / num2);
    }
}




