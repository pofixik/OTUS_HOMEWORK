package HW_16.tests.unit.fakes;

import HW_16.src.game.Dice;

public class DiceImplFake2 implements Dice {
    @Override
    public int roll() {
        return 4;
    }
}
