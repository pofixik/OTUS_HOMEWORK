package HW_16.tests;

import HW_16.tests.unit.GameTest01;

public class AllTests {
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");
        new GameTest01().testGameSameDice();
        System.out.println("\n\n----------------------\n\n");
        new GameTest01().testGameDice();
        System.out.println("\n\n----------------------\n\n");
        new GameTest01().testDice1_6();
        System.out.println("\n\n----------------------\n\n");
        new GameTest01().testNegativeDice();
        System.out.println("\n\n----------------------\n\n");

    }
}
