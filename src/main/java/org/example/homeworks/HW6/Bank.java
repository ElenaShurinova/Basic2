package org.example.homeworks.HW6;

//public class Bank {
    public class Bank {
//У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
        // Метод для подсчета дней

        public static int tagsConto(int G) {
            int tags = 0;

            while (G > 1) {
                for (int i = G - 1; i > 0; i--) {
                    if (G % i == 0) {
                        G -= i;
                        tags++;
                        break;
                    }
                }
            }
            tags++; // Добавляем день для снятия последнего доллара

            return tags;
        }

        public static void main(String[] args) {
            int initialAmount = 21; // Задаем начальную сумму

            // Выводим количество дней на экран
            System.out.println(tagsConto(initialAmount));
        }
    }

