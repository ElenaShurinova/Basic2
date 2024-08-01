package org.example.lessons._20240806;


public class Outer {

    void outerMethod() {
        System.out.println("inside outerMethod");
    }
    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }

        public int sum(int num1, int num2){
            return num1 + num2;
        }
    }
}

