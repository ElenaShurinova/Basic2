package org.example.lessons._20240806;

public class MainClass {
    public static void main(String[] args) {
         Outer outer = new Outer();
         outer.outerMethod();
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
        System.out.println("2 + 2 = " + inner.sum( 2,2));

    }
}

