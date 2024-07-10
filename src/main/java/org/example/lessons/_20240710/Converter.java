package org.example.lessons._20240710;

import java.util.Scanner;

//Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины​, ​Фаренгейты:
//У класса должны быть методы для конвертации.
//Реализуйте два метода в классе:
//runKelvinConverter(double baseValue)
//runFahrenheitConverter(double baseValue)

    public class Converter {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter grad cels");
            double celcius = scan.nextDouble();
            System.out.println(farenheitConverter(celcius));
            System.out.println(kelvinConverter(celcius));


        }
        public static double farenheitConverter(double celcius) {
            // F = (C *9 ⁄ 5) + 32
            double farenheit = (celcius * 9) / 5 + 32;
            return farenheit;
        }
        public static double kelvinConverter (double celcius) {
            //Celsius + 273.15.
            double kelvin = celcius + 273.15;
            return kelvin;
        }
    }

