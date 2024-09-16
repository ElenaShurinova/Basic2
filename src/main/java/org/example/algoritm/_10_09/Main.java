package org.example.algoritm._10_09;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;
import static org.example.algoritm._10_09.Task.binarySearchRecurs;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 8, 22, 98};
        int key = 22;
        //Arrays.sort(array); // condition for binary search - sorted array
        System.out.println(Arrays.toString(array));

        // calling a method and outputting the result to the console
        System.out.println("Index (Iteration) = "+binarySearch(array, key, 0, array.length - 1));

        System.out.printf("Index (Recurs) = %d%n", binarySearchRecurs(array, key, 0, array.length - 1));


    }
}
