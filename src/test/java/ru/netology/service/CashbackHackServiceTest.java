package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldBuyMoreWhenAmountBelowBoundary() { //покупка меньше 1000р
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldBuyMoreWhenAmountBelowBoundaryOnBoard() { //покупка на нижней границе
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldNotBuyMoreWhenAmountEqualsBoundary() { //покупка = 1000р
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldNotBuyMoreWhenAmountAboveBoundaryOnBoard() { //покупка = 1001р
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldNotBuyMoreWhenAmountAboveBoundary() { //покупка = 1500р
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }


}