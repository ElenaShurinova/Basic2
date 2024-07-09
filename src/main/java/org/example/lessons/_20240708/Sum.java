package org.example.lessons._20240708;

import java.util.Scanner;

public class Sum {
    public static int sumNums(int num1, int num2) {
        return num1 + num2;
    }

    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        return num;
    }
}

