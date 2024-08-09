package org.example.lessons._20240809;

public class Dog {
    private String name;
    private Integer age;
    private Boolean health;

    public void run() {
        System.out.println("собака с именем " + name + " начала бег!");
    }

    public void info() {
        System.out.println("собака с именем " + name
                + " имеет " + age + " возраст"
                + " имеет статус здоровья " + health);
    }
}
