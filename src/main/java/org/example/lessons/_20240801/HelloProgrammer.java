package org.example.lessons._20240801;

public class HelloProgrammer {
    public static void main(String[] args) {
        int count = 10;
        // Инициализация переменной count
        printHello(count);
        // Вызов метода для печати сообщения
    }

    // Метод для вывода сообщения "Привет Программист" count раз
    public static void printHello(int count) {
        int i = 0;
        // Счетчик итераций

        // Цикл while, который работает до тех пор, пока i < count
        while (i < count) {
            System.out.println("Привет Программист");
            i++;
            // Увеличиваем значение i на 1 после каждой итерации
        }
    }
}

