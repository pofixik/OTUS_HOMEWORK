package HW_12;

import java.util.Random;

public class Account {
    private int number=0;
    private double amount;

    public Account(int number) {
        this.number=number;
        this.amount= new Random().nextInt(100000)+ new Random().nextDouble() ;
    }


    public void setAccount(int number){
        this.number=number;
        this.amount=0.0;

    }
    public String toString() {

        return "Номер " + number + ", сумма=" + String.format("%.2f",amount);
    }

    public void printAccount(){
        System.out.println(number +" "+ String.format("%.2f",amount));
    }
}
