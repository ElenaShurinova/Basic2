package org.example.lessons._20243107;

public class ForEachClass {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        for(int i =  0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int item : arr) {
            System.out.println(item);
        }

//        Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
//5 4 3 2 1
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
