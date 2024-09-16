package org.example.algoritm.HW0309;

public class TowerofHanoi_recursive {
    public class HanoiTower {
        public static void hanoiRecursive(int n, char from, char to, char aux) {
            if (n == 1) { // Базовый случай: если остался один диск
                System.out.println("Переместите диск 1 с " + from + " на " + to);
                return;
            }
            hanoiRecursive(n - 1, from, aux, to); // Перемещаем n-1 дисков на вспомогательный стержень
            System.out.println("Переместите диск " + n + " с " + from + " на " + to);
            hanoiRecursive(n - 1, aux, to, from); // Перемещаем n-1 дисков на целевой стержень
        }

        public static void main(String[] args) {
            int n = 3; // Пример: 3 диска
            hanoiRecursive(n, 'A', 'C', 'B'); // A - начальный, C - целевой, B - вспомогательный
        }
    }
}
