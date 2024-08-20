package org.example.homeworks.HW9;

public class Utils {
    // Метод для проверки, что выигрышные числа находятся в правильном диапазоне
    public static boolean areWinningNumbersInRange(Lottery lottery) {
        return lottery.winningNumber1 >= 1 && lottery.winningNumber1 <= 100 &&
                lottery.winningNumber2 >= 1 && lottery.winningNumber2 <= 100 &&
                lottery.winningNumber3 >= 1 && lottery.winningNumber3 <= 100;
    }

    // Метод для установки выигрышных чисел вручную
    public static void setWinningNumbers(Lottery lottery, int num1, int num2, int num3) {
        lottery.winningNumber1 = num1;
        lottery.winningNumber2 = num2;
        lottery.winningNumber3 = num3;
    }
}

