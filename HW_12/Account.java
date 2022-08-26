package HW_12;

import java.util.Objects;
import java.util.Random;

public class Account {
    private int number=0;
    private double amount;
    User user;

    public Account(int number) {
        this.number=number;
        this.amount= new Random().nextInt(100000)+ new Random().nextDouble() ;

    }

    public void setUser(User user){
        this.user=user;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
