package org.example.lessons._20240709;

import java.util.Random;

public class RandomMathClass {
//    Использование Random класса:
//Импортировать класс java.util.Random
//Создать экземпляр класса Random (Random rand = new Random())
//Вызовите один из следующих методов объекта rand:
//nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
//nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
//nextDouble() генерирует двойное число между 0.0 и 1.0.

    public static void main(String[] args) {
        Random rand = new Random();
//        random int
        System.out.println(rand.nextInt());
//        random int from 0 to bound -1
        System.out.println(rand.nextInt(10));
//        random float
        System.out.println(rand.nextFloat());
//        random double
        System.out.println(rand.nextDouble());
//        random double > 0
        System.out.println(rand.nextDouble() * 100);
    }

}
