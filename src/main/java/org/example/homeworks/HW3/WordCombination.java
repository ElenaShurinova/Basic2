package org.example.homeworks.HW3;

import java.util.Scanner;

public class WordCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого слова
        System.out.println("Введите первое слово с четным количеством букв:");
        String word1 = scanner.nextLine();

        // Ввод второго слова
        System.out.println("Введите второе слово с четным количеством букв:");
        String word2 = scanner.nextLine();

        // Проверка, чтобы оба слова имели четное количество букв
        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            // Получение первой половины первого слова и второй половины второго слова
            String firstTail = word1.substring(0, word1.length() / 2);
            String secondTail = word2.substring(word2.length() / 2);

            // Создание нового слова
            String combinedWord = firstTail + secondTail;

            // Вывод результата на консоль
            System.out.println("Результат: " + combinedWord);
        } else {
            System.out.println("Оба слова должны состоять из четного количества букв.");
        }

        scanner.close();
    }
}

