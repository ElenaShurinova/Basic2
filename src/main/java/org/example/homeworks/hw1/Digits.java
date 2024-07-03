package org.example.homeworks.hw1;

public class Digits {
    public static void main(String[] args) {
        int num = 345;

        String str_num = String.valueOf(num);
        System.out.print(num + ": ");
        for (int i = 0; i < str_num.length(); i++) {
            System.out.print(str_num.charAt(i));
            if (i != str_num.length() - 1){
                System.out.print(", ");
            }
        }

    }
}
