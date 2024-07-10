package org.example.lessons._20240710;

import java.util.Random;

public class Student {

//        Напишите метод, который принимает на вход количество студентов и “рандомально” выбирает любого студента начиная со второго включительно.
//Например: в зуум сейчас присутствуют 10 участников. Первый участник - это преподаватель. Выбор должен быть сделан из 9 последующих, т.е. число выбирается из диапазона 2-10.

        // Метод для выбора случайного студента, начиная со второго
        public static int selectRandomStudent(int numberOfStudents) {
            if (numberOfStudents < 2) {
                throw new IllegalArgumentException("Number of students must be at least 2.");
            }

            Random random = new Random();
            // Генерация случайного числа от 2 до numberOfStudents (включительно)
            return random.nextInt(numberOfStudents - 1) + 2;
        }

        public static void main(String[] args) {
            // Пример использования метода для 10 студентов (1 преподаватель и 9 студентов)
            int totalParticipants = 10;
            int selectedStudent = selectRandomStudent(totalParticipants);

            System.out.println("Выбран студент номер: " + selectedStudent);
        }
    }


