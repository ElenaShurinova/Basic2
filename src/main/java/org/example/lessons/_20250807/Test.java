package org.example.lessons._20250807;

public class Test {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();
        pen1.setColor("red");
        pen2.setColor("white");
        pen3.setColor("Blue");

        Pen [] arrPens = new Pen []{
                pen1, pen2, pen3
        };
        for (int i = 0; i < arrPens.length; i++ ){
            System.out.println(arrPens[i].getColor());
        }
        pen1.setColor("green");
        pen2.setColor("red");
        pen3.setColor("black");
        for (int i = 0; i < arrPens.length; i++ ){
            System.out.println(arrPens[i].getColor());
        }


    }
}
