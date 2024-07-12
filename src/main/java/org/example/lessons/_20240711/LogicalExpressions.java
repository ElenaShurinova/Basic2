package org.example.lessons._20240711;

public class LogicalExpressions {
    public static void main(String[] args) {
        // Создаем переменные
        int a = 5;
        int b = 10;
        int c = 10;
        int d = 7;

        // Логическое выражение: a < b и b == c
        if (a < b && b == c) {
            System.out.println("a меньше b и b равно c: Истина");
        } else {
            System.out.println("a меньше b и b равно c: Ложь");
        }

        // Логическое выражение: a > b или c == d
        if (a > b || c == d) {
            System.out.println("a больше b или c равно d: Истина");
        } else {
            System.out.println("a больше b или c равно d: Ложь");
        }

        // Логическое выражение: a не равно b
        if (a != b) {
            System.out.println("a не равно b: Истина");
        } else {
            System.out.println("a не равно b: Ложь");
        }
    }
}
//```
//
//Этот код выполняет следующие действия:
//        1. Создает переменные `a`, `b`, `c`, `d` с заданными значениями.
//2. Проверяет логические выражения с использованием условных операторов `if`.
//        3. Выводит результаты проверок на консоль.
//
//При выполнении этого кода вы увидите следующий вывод:
//
//        ```plaintext
//a меньше b и b равно c: Истина
//a больше b или c равно d: Ложь
//a не равно b: Истина
//```
//
//Объяснение:
//        1. `a < b && b == c`: Истина, потому что `5 < 10` и `10 == 10`.
//        2. `a > b || c == d`: Ложь, потому что `5 > 10` (ложь) и `10 == 7` (ложь).
//        3. `a != b`: Истина, потому что `5 != 10`.
//}
