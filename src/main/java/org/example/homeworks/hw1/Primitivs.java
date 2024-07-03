package org.example.homeworks.hw1;

/*
*   В методе main инициализировать все примитивные типы и не примитивные типы.

* Вывести их результат в консоль:
char: G
int: 89
byte: 4
short: 56
float: 4.7333436
double: 4.355453532
long: 12121


Character: G
Integer: 89
Byte: 4
Short: 56
Float: 4.7333436
Double: 4.355453532
Long: 12121


* */

public class Primitivs {
    public static void main(String[] args) {
        char ch1 = 'G';
        int i1 = 89;  //4    01111111 11111111 11111111 11111111   -2_147_483_648..0..2_147_43_647
        byte b1 = 4;  //1     01111111   -128..0..127
        short sh1 = 56;  //2   01111111 11111111   -32 768..0..32 767
        float f1 = 4.7333436f;
        double d1 = 4.355453532;
        long l1 = 12_121L;

        System.out.println("char: " + ch1 + "\n" +
                "int: " + i1 + "\n" +
                "byte: " + b1 + "\n" +
                "short: " + sh1 + "\n" +
                "float: " + f1 + "\n" +
                "double: " + d1 + "\n" +
                "long: " + l1);

        Character ch2 = 'G';
        Integer i2 = 89;
        Byte b2 = 4;
        Short sh2 = 56;
        Float f2 = 4.7333436f;
        Double d2 = 4.355453532;
        Long l2 = 12121L;

        System.out.println("Character: " + ch2 + "\n" +
                "Integer: " + i2 + "\n" +
                "Byte: " + b2 + "\n" +
                "Short: " + sh2 + "\n" +
                "Float: " + f2 + "\n" +
                "Double: " + d2 + "\n" +
                "Long: " + l2);


    }
}
