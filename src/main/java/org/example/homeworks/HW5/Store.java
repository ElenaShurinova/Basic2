package org.example.homeworks.HW5;

public class Store {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;  // Edeka открыт
        boolean isReweOpen = false;  // Rewe закрыт

        // Вызов метода canBuy и вывод результата
        boolean canBuyFood = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuyFood);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}

