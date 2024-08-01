package org.example.lessons._20250807;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[10];
//        for (int i = 0; i < array.length; i++){
            //        regular
//            int[] array = new int[10];
//        literal
            int[] arrInt = {1, 2, 3, 4, 5};
//        for (int item : array) {
//            System.out.println(item);
//        }
//        System.out.println(array.length);
//        for (int item : arrInt) {
//            System.out.print(item + " ");
//        }
            for (int i = 0; i < arrInt.length; i++) {
                System.out.print(arrInt[i] + " ");
            }
            System.out.println();
//        System.out.println(arrInt[arrInt.length - 1]);
            System.out.println("Array length - " + arrInt.length);
            System.out.println("arrInt[" + (arrInt.length - 1) + "] = " + arrInt[arrInt.length - 1]);
        }
        }


