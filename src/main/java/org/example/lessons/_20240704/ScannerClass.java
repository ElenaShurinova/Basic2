package org.example.lessons._20240704;

import java.util.Locale;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("enter first number");
      double firstName = scanner.nextDouble();
        System.out.println("enter second number");
        double secondNumber = scanner.nextDouble();
        double sum = firstName + secondNumber;

//       boolean bool = scanner.nextBoolean();

        System.out.println(firstName + " + " + secondNumber + " = " + sum);
        System.out.printf(Locale.US,"%f.2 + %f.2 = %f.2" , firstName, secondNumber, sum);
    }
}
