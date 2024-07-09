package org.example.lessons._20240705;

public class Main {
    public static void main(String[] args) {
        //Char to Int
//Способ 1: использование значений ASCII
        char ch = 'A';
        int asciiValue = (int) ch;
        System.out.println("asciiValue = " + asciiValue);
        //Способ 2: использование метода valueOf() класса String

        Integer num = 3;// NPE - null
//        num.equals(2); //Вызывает NPE

        char ch2 = 'B';
        int asciiValue2 = (int) Character.valueOf(ch2);
        System.out.println("asciiValue2 = " + asciiValue2);

//Способ 3: использование метода getNumericValue() класса Character
        char ch3 = '9';
        int asciiValue3 = Character.getNumericValue(ch3);
        System.out.println("asciiValue3 = " + asciiValue3);

        String str = "11";
        Integer qwe = Integer.parseInt(str);
        Integer qwe2 = 9;
        System.out.println("sum= " + (qwe + qwe2));

        //НЕЯВНЫЕ ПРЕОБРАЗОВАНИЯ ТИПОВ
        int a = 10;
        long b = 12;
        long sum = a + b;
        System.out.println("sum = " + sum);

//ЯВНЫЕ ПРЕОБРАЗОВАНИЯ ТИПОВ
        double x = 10.5;
        int y = (int) x;
        System.out.println("y=" + y);
//        1. Произвести int → long путем “расширения” 2.
//        Произвести int → byte путем “сужения”
//        3. double → int 4. int → double
//        5. Распечатайте результат в консоль
//        Для теста используйте число int = 127,
//        а затем с числом 128 Проанализируйте вывод
        //1. Произвести int → long путем “расширения”
// 2. Произвести int → byte путем “сужения”
// 3. double → int 4. int → double
// 5. Распечатайте результат в консоль Для теста используйте число int = 127, а затем с числом 128 Проанализируйте вывод
        int a1 = 128;
        long b2 = a1;
        System.out.println("int > long =" + b2);

        byte b3 = (byte) a1;
        System.out.println("int > byte =" + b3);

        double a3 = 128.5;
        int b4 = (int) a3;
        System.out.println("double > int = " + b4);

        int a5 = 128;
        double b5 = a5;
        System.out.println("int > double =" + b5);



    }
}
