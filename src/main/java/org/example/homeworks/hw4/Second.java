package org.example.homeworks.hw4;

import java.util.Random;

public class Second {
//    Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий
//    день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000»
//    (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с
// информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Объяснение: в переменную n должно записываться случайное (на время тестирования программы)
// целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран
// (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает)
// должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
public static void main(String[] args) {
    // Генерируем случайное число секунд от 0 до 28800
    Random rand = new Random();
    int seconds = rand.nextInt(28800);

    // Выводим количество секунд
    System.out.println("Осталось " + seconds + " секунд.");
//    Разбирали на уроке как еще можно выполнить!!!!/////////////////
//    switch (b) {
//    case 0 -> System.out.println("меньше часа");
//    case 1 -> System.out.println("ровно часа");
//    case 2, 3, 4 -> System.out.println("осталось " + b);
//    default -> System.out.println("осталось " + b + " часов");
//}

    // Переводим секунды в полные часы
    int hours = seconds / 3600;

    // Выводим результат в часах
    if (hours > 1) {
        System.out.println("Осталось " + hours + " часов.");

    } else if (hours == 1) {
        System.out.println("Остался 1 час.");
    } else {
        System.out.println("Осталось менее часа.");
    }
}
}
// СПособ решения через (разбирали на уроке) switch!!!!!! ////////////////////////
//public class Main {
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        int a = rnd.nextInt(28800);
//        int b = a / 3600;
//        System.out.println("Секунд осталось: " + a);
//        switch (b) {
//            case 0: {
//                System.out.println("меньше часа");
//                break;
//            }
//            case 1: {
//                System.out.println("ровно часа");
//                break;
//            }
//            case 2:
//            case 3:
//            case 4: {
//                System.out.println("осталось " + b);
//                break;
//            }
//            default: {
//                System.out.println("осталось " + b + " часов");
//            }
//        }
//
//    }
//}

