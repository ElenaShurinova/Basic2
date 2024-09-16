//package org.example.algoritm._27082024;
//
//public class Main {
//    // Анализируем
//    // - сравнения («больше», «меньше», «равно»);
//    // - присваивания;
//    // - выделение памяти.
//
//    static int sum (int one, int two) {
//        int result = one + two; //cost = 1+1
//        return result; // +1
//    }
//    // O(3) ~ O(1)
//
//    static int sum1 (int one, int two) {
//        return  one + two; //cost = 1+1
//    }
//// O(2) ~ O(1)
//
//
//    static int sum(int[] array)  { //O(n)
//        int sum = 0;  //cost = 1
//        for (int i = 0; i < array.length; i++) { //cost = 1+ 1*n +1*n
//            sum = sum + array[i];  // cost = 2 n
//        }
//        return sum; // cost = 1
//    }
// 1 + 1 + n + n + 2n + 1 = O(3 + 4n)  ~> O(n)
