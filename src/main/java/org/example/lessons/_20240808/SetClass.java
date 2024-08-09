package org.example.lessons._20240808;

import java.util.Arrays;
import java.util.Scanner;

public class SetClass {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("введите число");
            int num = scanner.nextInt();
            array[i] = num;

        }

        System.out.println(Arrays.toString(array));
        System.out.println("веедите число для поиска");
        int key = scanner.nextInt();
        int result = linearSearch(array, key);
        if (result != -1){
            System.out.println("Элемент найден по  " + result + " индексу");

        }
        else {
            System.out.println("Элемент не найден");

        }

    }


    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
//    Получить от пользователя набор данных ( 6 целочисленных значений)
//Сохранить полученные данные в массив
//Получить от пользователя ключевой элемент
//Реализовать метод линейного поиска ключевого элемента в массиве, метод должен вернуть индекс элемента или -1
//Если элемент существует, вывести на консоль: Элемент в n-индексе, иначе Элемент не найден.
//Проанализируйте написанный код используя режим Дебаггер


