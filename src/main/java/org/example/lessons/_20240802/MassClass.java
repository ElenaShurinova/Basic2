package org.example.lessons._20240802;

public class MassClass {
    public static void main(String[] args) {
        Integer[] mass = {20, 23, 31, 41, 55, 66, 71, 756, 921};
        for (int i = 0; i < mass.length; i++) {
            Integer elem =mass[i];
            System.out.printf("mass [%d] = %d\n", i, elem);
        }
        System.out.println("======================================");
        for (Integer elem : mass) {
            System.out.printf("mass [i] = %d\n", elem);
        }
    }
}
