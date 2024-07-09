package org.example.homeworks.hw2;

public class Strings {
    public static void main(String[] args) {
//        Создайте строку через new - I study Basic Java!
        String str1 = new String("I study Basic Java!");


                // 2. Распечатать пред-последний символ строки. Используем метод String.charAt().
                char penultimate = str1.charAt(str1.length() - 2);
                System.out.println("Предпоследний символ строки: " + penultimate);

                // 3.Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
                boolean contains = str1.contains("Java");
                System.out.println("Содержит ли строка 'Java': " + contains);

                // 4. Вырезать строку Java c помощью метода String.substring().
                String cut = str1.substring(0, str1.indexOf("Java")) + str1.substring(str1.indexOf("Java") + "Java".length());
                System.out.println("Строка без 'Java': " + cut);

                // 5.Заменить все символы “а” на “о”
                String replace = str1.replace('a', 'o');
                System.out.println("Заменяем все 'a' на 'o': " + replace);

                // 6. Преобразуйте строку к верхнему регистру
                String modify = str1.toUpperCase();
                System.out.println("Строка в верхнем регистре: " + modify);

                // 7. Преобразуйте строку к нижнему регистру
                String modify1 = str1.toLowerCase();
                System.out.println("Строка в нижнем регистре: " + modify1);
            }
        }

