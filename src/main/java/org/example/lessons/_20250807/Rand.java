package org.example.lessons._20250807;

import java.util.Arrays;
import java.util.Random;

public class Rand {
    public static void main(String[] args) {
//        Создайте массив из 15 случайных целых чисел из отрезка [0;9]
//Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        Random rand = new Random();
        int [] numRan = new int[15];
        for (int i = 0; i < numRan.length; i++) {
            numRan[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numRan));
        int even = 0;
        for(int i = 0; i < numRan.length; i++){
            if (numRan[i] % 2 == 0){
                even++;
            }

        }
        System.out.println(even);


    }
}
