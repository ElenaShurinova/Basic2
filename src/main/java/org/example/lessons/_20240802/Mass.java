package org.example.lessons._20240802;

public class Mass {
    public static void main(String[] args) {
        int[] mass = {20, 23, 31, 41, 55, 66, 71, 756, 921};
        for (int i = 0; i < mass.length; i++) {
            System.out.println("mass [" + i + "] = " + mass[i]);
            System.out.printf("mass [%d] = %d\n", i, mass[i]);
        }
    }
}
