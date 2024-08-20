package org.example.homeworks.HW9;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LotteryTes {
    @Test
    public void testWinningNumbersInRange() {
        Lottery lottery = new Lottery();
        assertTrue(Utils.areWinningNumbersInRange(lottery));
    }

    @Test
    public void testPlayerWins() {
        Lottery lottery = new Lottery();

        Utils.setWinningNumbers(lottery, 10, 20, 30);
        assertTrue(lottery.playerWon(10, 20, 30));
    }

    @Test
    public void testPlayerLoses() {
        Lottery lottery = new Lottery();

        Utils.setWinningNumbers(lottery, 10, 20, 30);
        assertFalse(lottery.playerWon(10, 20, 31));
    }


    }


