package HW_12;

import java.util.Random;

public class Account {
    private int number=0;
    private double amount;

    public Account(int number) {
        this.number=number;
        this.amount= new Random().nextInt(100000)+ new Random().nextDouble() ;
    }

    public Account(int number, double amount) {
        this.number=number;
        this.amount= amount ;
    }
    public Account() {}

    public int getNumber(){
        return number;
    }

    public String toString() {

        return "Номер " + number + ", сумма=" + String.format("%.2f",amount);
    }
}
