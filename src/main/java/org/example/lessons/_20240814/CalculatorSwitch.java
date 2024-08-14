package org.example.lessons._20240814;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Введите знак мат.операции (+,-,*,/): ");
        String operationInput = scanner.next();
        char operation = operationInput.charAt(0);
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Операция не поддерживается");
            return;
        }
        System.out.println("Введите первое число :");
        double argumentOne = scanner.nextDouble();
        System.out.println("Введите второе число :");
        double argumentTwo = scanner.nextDouble();
        double res = 0;
        if ( (operation == '/' || operation == '%') && argumentTwo == 0) {
            System.out.println("на 0 делить нельзя.");
            return;
        }

        switch (operation) {
            case '+':
                res = argumentOne + argumentTwo;
                break;
            case '-':
                res = argumentOne - argumentTwo;
                break;
            case '*':
                res = argumentOne * argumentTwo;
                break;
            case '/':
                if (argumentTwo == 0) {
                    System.out.println("На 0 делить нельзя.");
                    return;
                }
                res = argumentOne / argumentTwo;
                break;
            case '%':
                res = argumentOne % argumentTwo;
                break;
        }

        System.out.println(argumentOne + " " + operation + " " + argumentTwo + " = " + res);
        System.out.printf("%.2f %s %.2f = %.2f", argumentOne, operation, argumentTwo, res);

    }


}


