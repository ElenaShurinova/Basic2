package org.example.lessons._20240710;
//Напишите программу на Java для того, чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной:
//
//На вход: а = 2; b = 5;
//На выход: a = 5; b = 2;
//Используйте переменную temp;
public class SwapClass {
    public static void main(String[] args) {

                int a = 2;
                int b = 5;
                System.out.println("a = " + a + " b = " + b);
//                int temp = a;
//                a = b;
//                b = temp;

                a = a + b;
                b = a - b;

                a = a - b;
                System.out.println("a = " + a + " b = " + b);
            }

        }

