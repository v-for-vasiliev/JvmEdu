package ru.jvm.edu.test;

public class TestableHuman {

    @BeforeSuit
    void wakeUp() {
        System.out.println("I'm awake");
    }

    @Test(priority = 10)
    void wearUnderpants() {
        System.out.println("Pants are on");
    }

    @Test(priority = 9)
    void wearSocks() {
        System.out.println("Socks are on");
    }

    @Test(priority = 8)
    void wearTrousers() {
        System.out.println("Trousers are on");
    }

    @Test(priority = 7)
    void wearTShirt() {
        System.out.println("TShirt is on");
    }

    @Test(priority = 6)
    void wearSweater() {
        System.out.println("Sweater is on");
    }

    @Test(priority = 5)
    void wearBoots() {
        System.out.println("Boots are on");
    }

    @Test(priority = 4)
    void wearJacket() {
        System.out.println("Jacket is on");
    }

    @Test(priority = 2)
    void wearHat() {
        System.out.println("Hat is on");
    }

    @Test(priority = 3)
    void wearScarf() {
        System.out.println("Scarf is on");
    }

    @AfterSuit
    void goToWork() {
        System.out.println("I'm going to work");
    }
}
