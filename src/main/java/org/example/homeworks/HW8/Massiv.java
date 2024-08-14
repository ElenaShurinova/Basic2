package org.example.homeworks.HW8;
//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n .
// Найдите недостающий элемент.
//
//
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9
public class Massiv {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("Недостающий элемент в первом массиве: " + findMissingNumber(arr1, 5));
        System.out.println("Недостающий элемент во втором массиве: " + findMissingNumber(arr2, 10));
    }

    // Функция для поиска недостающего числа
    public static int findMissingNumber(int[] arr, int n) {
        int sumN = n * (n + 1) / 2; // Сумма всех чисел от 1 до n
        int sumArr = 0;

        // Вычисляем сумму элементов массива
        for (int num : arr) {
            sumArr += num;
        }

        // Разница между полной суммой и суммой массива даст недостающее число
        return sumN - sumArr;
    }
}

