package org.example.lessons._20240711;

public class UnaryTest {
    public static void main(String[] args) {
//        Создайте класс UnaryTest
//Создайте переменную с положительным знаком
//Примените к переменной пост-инкремент и пост-декремент
//Примените к переменной пре-инкремент и пре-декремент
//Используя режим дебаггера проследите изменения

        int num = 5; // Создаем переменную с положительным значением
        System.out.println("Исходное значение: " + num);

        // Применяем постфиксный инкремент (num++)
        System.out.println("Постфиксный инкремент: " + (num++));
        System.out.println("После постфиксного инкремента: " + num);

        // Применяем постфиксный декремент (num--)
        System.out.println("Постфиксный декремент: " + (num--));
        System.out.println("После постфиксного декремента: " + num);

        // Применяем префиксный инкремент (++num)
        System.out.println("Префиксный инкремент: " + (++num));
        System.out.println("После префиксного инкремента: " + num);

        // Применяем префиксный декремент (--num)
        System.out.println("Префиксный декремент: " + (--num));
        System.out.println("После префиксного декремента: " + num);

        // Создаем переменные
        int a = 5;
        int b = 10;
        int c = 7;

        // Сравнения и вывод результатов
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));

        System.out.println("a < c: " + (a < c));
        System.out.println("a > c: " + (a > c));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
        System.out.println("a <= c: " + (a <= c));
        System.out.println("a >= c: " + (a >= c));

        System.out.println("b < c: " + (b < c));
        System.out.println("b > c: " + (b > c));
        System.out.println("b == c: " + (b == c));
        System.out.println("b != c: " + (b != c));
        System.out.println("b <= c: " + (b <= c));
        System.out.println("b >= c: " + (b >= c));

        //a < b: true
        //a > b: false
        //a == b: false
        //a != b: true
        //a <= b: true
        //a >= b: false
        //
        //a < c: true
        //a > c: false
        //a == c: false
        //a != c: true
        //a <= c: true
        // a >= c: false
       //
        //b < c: false
       //b > c: true
        //b == c: false
       //b != c: true
        //b <= c: false
       //b >= c: true


    }
}







