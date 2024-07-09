package org.example.lessons._20240709;

public class Concatenation {

//    Создайте класс Concatenation 
//Создайте метод, который принимает две переменные типа String
//Примените конкатенацию строк и выведите результат в консоль.
//Скомпилируйте созданную программу.




        // Метод, который принимает две строки и печатает их конкатенацию в консоль
        public static void concatString(String str1, String str2) {
            String result = str1 + str2;
            System.out.println("Результат конкатенации: " + result);
        }

        public static void main(String[] args) {
            // Создаем экземпляр класса Continuation
            Concatenation Concatenation = new Concatenation();

            // Две строки для тестирования
            String string1 = "Hello, ";
            String string2 = "World!";

            // Вызываем метод concatenateAndPrint
            Concatenation.concatString(string1, string2);
        }
    }

