package org.example.lessons._20250807;

import java.util.Arrays;
import java.util.Random;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};

        int[] arrCopy = Arrays.copyOf(arr1,3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arrCopy));

        int [] arrRange = Arrays.copyOfRange(arr1,1,3);
        System.out.println(Arrays.toString(arrRange));

        Random rand = new Random();
        int[] userArr = new int[10];
        for(int i = 0; i < userArr.length; i++) {
            userArr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(userArr));

        Arrays.sort(userArr);
        System.out.println(userArr);
        System.out.println();
        System.out.println(Arrays.toString(userArr));
    }


    }

