package org.example.lessons._20240814;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Введите знак +, -, *, /, %");
        String sing = scanner.next();
        char charAt = sing.charAt(0);

        if (charAt != '+' && charAt != '-' && charAt != '*' && charAt != '/' && charAt != '%') {
            System.out.println("операция не поддерживается программой.");
            return;
        }

        System.out.println("Введите первое число");
        double numFirst = scanner.nextDouble();

        System.out.println("Введите второе число");
        double numSecond = scanner.nextDouble();

        double res = 0;

        if ( (charAt == '/' || charAt == '%') && numSecond == 0) {
            System.out.println("на 0 делить нельзя.");
            return;
        }

        switch (charAt){
            case '+' :
                res = numFirst + numSecond;
                break;
            case '-':
                res = numFirst - numSecond;
                break;
            case '*':
                res = numFirst * numSecond;
                break;
            case '/':
                res = numFirst / numSecond;
                break;
            case '%':
                res = numFirst % numSecond;
                break;
        }

        System.out.println(numFirst + " " + charAt + " " + numSecond + " = " + res);
        System.out.printf("%.2f %s %.2f = %.2f", numFirst, charAt, numSecond, res);
    }

}
