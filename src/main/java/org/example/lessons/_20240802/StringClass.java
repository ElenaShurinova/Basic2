package org.example.lessons._20240802;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Hello World!1234";
        String s2 = "Hello World!123";
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s2.charAt(i) != s1.charAt(i)) {
                System.out.println("НЕСООТВЕТСТИВЕ СИМВОЛА: " + s2.charAt(i));
            }
        }
    }
//    public static void main(String[] args) {
//        String s1 = "Hello World!1234";
//        String s2 = "Hello World!123";
//        for (int i = 0; true; i++) {
//            System.out.println("НЕСООТВЕТСТИВЕ СИМВОЛА: ");
//        }
//    int i = 0;
//int p = 10;
//for (;i < p;) {
//    System.out.println("НЕСООТВЕТСТИВЕ СИМВОЛА: " + i);
//    i++;
//}
//System.out.println("WHILE: ========");
//int j = 0;
//int k = 10;
//while (j < k) {
//    System.out.println("НЕСООТВЕТСТИВЕ СИМВОЛА: " + j);
//    j++;
//}
    }

