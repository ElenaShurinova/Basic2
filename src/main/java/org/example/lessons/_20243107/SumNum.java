package org.example.lessons._20243107;

public class SumNum {
    public static void main(String[] args) {
//        Реализуйте метод который принимает два числа, сравнивает их и возвращает сумму всех вхождений в максимальное число.
//Например:
//Вход = 2, 3
//Выход = 6
//Объяснение: 3 больше чем 2, все вхождения 1+2+3 = 6



                int num1 = 1;
                int num2 = 5;
                System.out.println(sumNum(num1, num2));
            }

            public static int sumNum(int num1, int num2) {
                int maxNum = num1 > num2 ? num1 : num2;
                int sum = 0;
                for (int i = 1; i <= maxNum; i++) {
                    sum += i;
                }
                return sum;
            }

        }


