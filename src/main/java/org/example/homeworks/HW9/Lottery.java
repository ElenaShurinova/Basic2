package org.example.homeworks.HW9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    int winningNumber1;
    int winningNumber2;
    int winningNumber3;

    public Lottery() {
        Random random = new Random();
        winningNumber1 = random.nextInt(100) + 1;
        winningNumber2 = random.nextInt(100) + 1;
        winningNumber3 = random.nextInt(100) + 1;
    }

    // Метод для проверки, выиграл ли игрок
    public boolean playerWon(int number1, int number2, int number3) {
        return number1 == winningNumber1 && number2 == winningNumber2 && number3 == winningNumber3;
    }
}
