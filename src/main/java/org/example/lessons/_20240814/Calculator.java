package org.example.lessons._20240814;

import java.util.Locale;
import java.util.Scanner;

//Напишите программу "Калькулятор", производящую вычисления с двумя числами c дробной частью
//Тип данных вводимых аргументов должен быть Double
//Пользователь должен ввести с клавиатуры знак выполняемой математической операции в формате строки, а затем программа должна преобразовать введенную строку в значение переменной типа Char (получить из строки первый символ методом string.charAt(0);).
//Требуется произвести проверку введенных данных:
//Если пользователь ввёл знак операции, отличный от +, -, *, / - выводить сообщение о том, что указанная операция не поддерживается программой.
//Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента ввёл значение 0, то программа должна вывести сообщение о том, что на 0 делить нельзя.
//В обеих ситуациях программа должна прекращать дальнейшую работу.
//Результат вычислений необходимо вывести с точностью до двух чисел после запятой в формате <значение переменной argumentOne> <знак математической операции> <значение переменной argumentTwo> = <значение переменной результата>.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Введите знак мат.операции (+,-,*,/): ");
        String operationInput = scanner.next();
        char operation = operationInput.charAt(0);
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Операция не поддерживается");
            return;
        }
        System.out.println("Введите первое число :");
        double argumentOne = scanner.nextDouble();
        System.out.println("Введите второе число :");
        double argumentTwo = scanner.nextDouble();
        double res = 0;
        if (operation == '+') {
            res = argumentOne + argumentTwo;
        } else if (operation == '-') {
            res = argumentOne - argumentTwo;
        } else if (operation == '*') {
            res = argumentOne * argumentTwo;
        } else if (operation == '/') {
            if (argumentTwo == 0) {
                System.out.println("Делитель не может иметь значение 0!");
                return;
            }
            res = argumentOne / argumentTwo;
        }
        System.out.printf("%.2f %s %.2f = %.2f", argumentOne, operation, argumentTwo, res);

    }
}
