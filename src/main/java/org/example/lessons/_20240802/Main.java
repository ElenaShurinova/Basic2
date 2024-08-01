package org.example.lessons._20240802;

public class Main {
    public static void main(String[] args) {


            int a = 5;
            int b = 10;
            String variable = compare(a, b);
            System.out.println(variable);
            //TODO где то использовать еще
        }

        private static String compare ( int a, int b){
            if (a > b) {
                return "A>b";
            } else if (a == b) {
                return "a=b";
            } else {
                return "a<b";
            }

//            private static void compare(int a, int b) {
//                if (a > b) {
//                    System.out.println("A>b");
//                    return;
//                } else if (a == b) {
//                    System.out.println("a=b");
//                } else if(a<b) {
//                    System.out.println("a<b");
//                }else if(a<1000){
//                }
//                System.out.println("проверка что иф закончился и дальше не пошли");
//                if(a==b){
//
//                }
//            }

//            for (int i = 0; i < 10; i++) {
//                for (int j = 0; j < 2; j++) {
//                    System.out.println(" (i,j)=" + i + " " + j);
//                    break;
//                }
//                System.out.println("вложенный цикл закончился");
            }
        }






