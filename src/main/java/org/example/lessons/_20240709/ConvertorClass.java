package org.example.lessons._20240709;

import java.util.Scanner;

public class ConvertorClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input system:");
        int inputSystem = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a number:");
        long num = Long.parseLong(sc.nextLine(), inputSystem);
        System.out.println("Output system:");
        int outputSystem = sc.nextInt();
        System.out.println(num + " = " + Long.toString(num, outputSystem));
//    Создайте класс Converter - конвертер системы счисления. 
//У пользователя спрашивается число системы счисления, (используйте Scanner)
//Запрашивается само число (ожидается корректный ввод)
//У пользователя спрашивается число системы счисления в какую перевести
//Конвертация должна быть с помощью класса обертки Long.
    }
}
