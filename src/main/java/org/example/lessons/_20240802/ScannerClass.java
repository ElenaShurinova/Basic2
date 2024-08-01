package org.example.lessons._20240802;

public class ScannerClass {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        do {
            System.out.println("введи значение от 0 до 10");
            n = sc.nextInt();
        } while (n < 0 || n > 10);
        System.out.println("вы ввели "+ n);


//        public static void main(String[] args) {
//            java.util.Scanner sc = new java.util.Scanner(System.in);
//            int n;
//            System.out.println("введи значение от 0 до 10");
//            n = sc.nextInt();
//            while (n < 0 || n > 10) {
//                System.out.println("введи значение от 0 до 10");
//                n = sc.nextInt();
//            }
//            System.out.println("вы ввели " + n);
//        }
    }
}


