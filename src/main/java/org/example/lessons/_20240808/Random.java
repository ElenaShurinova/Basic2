package org.example.lessons._20240808;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int len = 10;
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        printArray(arr);
        int key = 8;
        System.out.println("Index of " + key + " in array is " + linearSearch(arr, key));
    }

    int nextInt(int i) {
        return i;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

