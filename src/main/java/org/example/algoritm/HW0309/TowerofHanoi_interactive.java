package org.example.algoritm.HW0309;

import java.util.Stack;

public class TowerofHanoi_interactive {



    public class HanoiTower {
        static class Move {
            int n;
            char from;
            char to;
            char aux;
            Move(int n, char from, char to, char aux) {
                this.n = n;
                this.from = from;
                this.to = to;
                this.aux = aux;
            }
        }

        public static void hanoiIterative(int n, char from, char to, char aux) {
            Stack<Move> stack = new Stack<>();
            stack.push(new Move(n, from, to, aux)); // Начинаем с первого движения

            while (!stack.isEmpty()) {
                Move move = stack.pop();
                if (move.n == 1) { // Если один диск, просто перемещаем его
                    System.out.println("Переместите диск 1 с " + move.from + " на " + move.to);
                } else {
                    // Последовательность шагов для перемещения n дисков
                    stack.push(new Move(move.n - 1, move.aux, move.to, move.from));
                    stack.push(new Move(1, move.from, move.to, move.aux));
                    stack.push(new Move(move.n - 1, move.from, move.aux, move.to));
                }
            }
        }

        public static void main(String[] args) {
            int n = 3; // Пример: 3 диска
            hanoiIterative(n, 'A', 'C', 'B'); // A - начальный, C - целевой, B - вспомогательный
        }
    }
}
