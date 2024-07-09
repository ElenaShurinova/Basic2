package org.example.lessons._20240709;


    public  class RandomClass {
        public static void main(String[] args) {
            int min = 10;
            int max = 100;

            //double randomValue = Math.random() * (max - min + 1) + min;
            int randomValue = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(randomValue);


        }
    }

