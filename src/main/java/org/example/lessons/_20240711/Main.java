package org.example.lessons._20240711;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        a++;
//        System.out.println(a);
//        a--;
//        System.out.println(a);
//        System.out.println(-a);
//        ++a;
//        System.out.println(a);
//        --a;
//        System.out.println(a);

        //        post increment
        int i = 10;
        int a = i++; // a = i; i = i + 1
        System.out.println(i + " " + a);
        System.out.println();
//        post decrement
        int j = 10;
        int z = j--; // z = j; j = j - 1
        System.out.println(j + " " + z);
        System.out.println("--------pred-------");
//        pred increment
        int i1 = 10;
        int a1 = ++i1; // i1 = i1 + 1; a1 = i1;
        System.out.println(i1 + " " + a1);
//      pred decrement
        int j1 = 10;
        int z1 = --j1; // j1 = j1 - 1; z1 = j1;
        System.out.println(j1 + " " + z1);

   }
}
