package org.example.lessons._20240801;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                // Отображаем меню выбора
                System.out.println("Меню выбора игрока:");
                System.out.println("1. Elf");
                System.out.println("2. Orc");
                System.out.println("Q. Exit");
                System.out.print("Choose any one : ");

                // Считываем ввод пользователя
                choice = scanner.nextLine().trim();

                // Проверяем выбор пользователя
                switch (choice) {
                    case "1":
                        System.out.println("Вы выбрали: Elf");
                        break;
                    case "2":
                        System.out.println("Вы выбрали: Orc");
                        break;
                    case "Q":
                    case "q":
                        System.out.println("Выход из игры...");
                        break;
                    default:
                        System.out.println("Неверный ввод. Пожалуйста, выберите одну из опций.");
                        break;
                }

                System.out.println(); // Пустая строка для разделения вывода

            } while (!choice.equalsIgnoreCase("Q"));

            scanner.close();
        }
    }


