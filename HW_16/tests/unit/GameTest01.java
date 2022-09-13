package HW_16.tests.unit;
import HW_16.src.game.*;
import HW_16.tests.unit.fakes.DiceImplFake;
import HW_16.tests.unit.fakes.DiceImplFake2;

public class GameTest01 {

    public void testGameSameDice(){
        String scenario="Тест 1. Оба игрока выкинули одинаковое число";
        try{
            Dice dice = new DiceImplFake();

            Player player1=new Player("Вася");
            Player player2=new Player("Игорь");

            int player1Result = dice.roll();
            int player2Result = dice.roll();
            Player winner = (player1Result > player2Result)? player1: player2;

            if ((winner==player1&& winner==player2)||(winner!=player1&& winner!=player2)) {
                System.out.printf("\"%s\" passed %n", scenario);
            }
            else{
                throw new AssertionError(winner.getName() + " не является победителем, должна быть ничья") ;
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
    public void testGameDice(){
        String scenario="Тест 2. Второй игрок выкинул больше";
        try{
            Dice dice_1 = new DiceImplFake();
            Dice dice_2 = new DiceImplFake2();

            Player player1=new Player("Вася");
            Player player2=new Player("Игорь");

            int player1Result = dice_1.roll();
            int player2Result = dice_2.roll();
            Player winner = (player1Result > player2Result)? player1: player2;

            if ((winner==player2)) {
                System.out.printf("\"%s\" passed %n", scenario);
            }
            else{
                throw new AssertionError(winner.getName() + " не является победителем, победить должен "+ player2.getName() ) ;
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
    public void testDice1_6(){
        String scenario="Тест 3. Кость выбрасывает число от 1-6";
        try{
            Dice dice = new DiceImpl();
            int diceMin=1;
            int diceMax=6;
            int actualDice=dice.roll();

            if (actualDice>=diceMin&&actualDice<=diceMax) {
                System.out.printf("\"%s\" passed %n", scenario);
            }
             else{
                throw new AssertionError(actualDice+ " не лежит в отрезке 1-6") ;
                }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }

    public void testNegativeDice(){
        String scenario="Тест 4. Кость всегда выбрасывает число больше 0";
        try{
            Dice dice = new DiceImpl();

            for (int i=0; i<100;i++){
                int actualDice=dice.roll();

            if (actualDice<0) {
                throw new AssertionError(actualDice+ " меньше 0") ;
            }

            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
}
