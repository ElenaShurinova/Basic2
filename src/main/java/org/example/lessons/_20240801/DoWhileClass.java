package org.example.lessons._20240801;

public class DoWhileClass {
    public static void main(String[] args) {
//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);
//        while (i < 5) {
//            System.out.println("JAVA");
//            i++;
//        }

//        Используйте цикл do-while
//Инициализируйте переменную int i = 0;
//Добавьте в тело инструкцию System.out.println("Я в теле DO");
//Определите условие i < 3
//Запустите код
//Определите условие i < 0
//Проанализируйте результат

        int i = 0; // Инициализация переменной i

        // Цикл do-while
        do {
            System.out.print(" я в теле DO");
            // Инструкция в теле do
            i++;
            // Увеличиваем значение i на 1 после каждой итерации
        } while (i < 3);
        // Условие завершения цикла

        System.out.println();
        // Перевод строки для удобства восприятия

        // Сброс переменной i для анализа другого условия
        i = 0;

        // Цикл do-while с измененным условием
        do {
            System.out.print(" я в теле DO");
            i++;
        } while (i < 0);
        // Новое условие завершения цикла
    }
}



