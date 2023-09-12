package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnCashBack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 988;

        int actual = cashbackHackService.remain(amount);
        int expected = 12;

        assertEquals(expected, actual);

    }


    @Test
    void shouldReturnAllCashBack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }
    @Test
    void shouldReturnOneCashBack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnNullCashBack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

}