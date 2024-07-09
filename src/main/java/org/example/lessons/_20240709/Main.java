package org.example.lessons._20240709;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
////        System.out.println("Hello world!");
////        int num1 = getNum();
////        int num2 = getNum();
////        System.out.println(sumNums(num1, num2));
////        num1 = getNum();
////        num2 = getNum();
////        System.out.println(sumNums(num1, num2));
////        num1 = getNum();
////        num2 = getNum();
////        System.out.println(sumNums(num1, num2));
//        int num1 = 0;
//        int num2 = 0;
//        int i = 0;
//        while(i < 50) {
//            num1 = getNum();
//            num2 = getNum();
//            System.out.println(sumNums(num1, num2));
//            i++;
//        }
//    }
//
//    public static int sumNums(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int getNum() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//        return num;
//    }



    public class Main {

        // Метод getSum ничего не возвращает и печатает сумму в консоль
        public static void getSum(int a, int b) {
            int sum = a + b;
            System.out.println("Сумма: " + sum);
        }

        // Метод getReturnSum возвращает сумму двух чисел
        public static int getReturnSum(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            // Вызов метода getSum
            getSum(5, 10);

            // Вызов метода getReturnSum и печать результата в консоль
            int result = getReturnSum(5, 10);
            System.out.println("Сумма, возвращенная методом getReturnSum: " + result);
        }
    }




