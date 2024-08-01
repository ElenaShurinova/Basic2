package org.example.lessons._20250807;

import java.util.Arrays;

public class Mass {
    public static void main(String[] args) {
        int[] numOdd = new int[50];
        int index = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                numOdd[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(numOdd));
        for (int i = numOdd.length - 1; i >= 0; i--) {
            System.out.print(numOdd[i] + " ");
        }

    }
}
