package org.example.lessons._20240805;

public class Factor {
    public static void main(String[] args) {
        int n = 5;
        int result =1;
        for (int i = 1; i <=n; i++){
            result *= i;
        }
        System.out.println( "factorial" + n + ":" + result);
        int result2 =1;
        int  i= 1;
        while ( i <= n) {
            result2 *= i;
            i++;

        }
        System.out.println("factorial" + n + ":" + result2);
    }
}
