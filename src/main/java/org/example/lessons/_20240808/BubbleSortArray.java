package org.example.lessons._20240808;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] array ={22, 3, 4, 2, 50};
        System.out.println("масив до сортировки");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);

        System.out.println(Arrays.toString(array));



    }
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int k;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length -1;  i++){
                if (array[i] > array[i+1] ){
                    k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                    isSorted = false;
                }
            }
        }
    }
}
