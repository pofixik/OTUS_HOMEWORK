package HW_12;

public class Account {
    private static int id=0;
    private int number;
    private double amount;
    private int login_id;

    public Account(int number, int login_id){
        this.id=++id;
        this.number=number;
        this.amount=0.0;
        this.login_id=login_id;
    }
}
