package org.example.lessons._20240815;

import java.util.Locale;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

//        Продолжаем работу над калькулятором.
//Обновите "Калькулятор" до версии 2,
//Обновите функционал до производящего вычисления (+, -, *, /)
// с произвольным количеством чисел c дробной частью.
//Количество аргументов пользователь вводит с клавиатуры. Оно должно быть от 2 и более.
//Тип данных вводимых аргументов должен быть Double.
//Далее пользователь последовательно вводит значение каждого из аргументов, а затем - знак математической операции, которую необходимо выполнить со значениями введенных аргументов. 
//Результат работы программы необходимо вывести в виде вычисляемого выражения и полученного результата с точностью до двух чисел после запятой.

            Calculator calculator = new Calculator();
            calculator.run();
        }
}