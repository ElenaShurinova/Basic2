package org.example.lessons._20240704;

import java.util.Objects;

public class StringClass {
    public static void main(String[] args) {
        String language = "Java";
        String language2 = "Java";
        System.out.println( language == language2);
        System.out.println(Objects.equals(language, language2));

        String language3 = new String("Java");
        System.out.println(language == language3);
        System.out.println(Objects.equals(language,language3));

    }
}
