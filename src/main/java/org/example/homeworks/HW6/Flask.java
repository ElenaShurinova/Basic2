package org.example.homeworks.HW6;
// Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.
public class Flask {

    // Метод для проверки температуры
    public static boolean Sample(int t1, int t2) {
        return t1 > 100 && t2 < 100;
    }

    public static void main(String[] args) {
        int temperature1 = 103; // Задаем температуру первой колбы
        int temperature2 = 97;  // Задаем температуру второй колбы

        // Проверяем устройство и выводим результат
        System.out.println(Sample(temperature1, temperature2));
    }
}


