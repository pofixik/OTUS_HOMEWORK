package HW_12;

import java.util.Date;

public class User  {

    private String fullName;
    private Account[] accounts=new Account[2];
    private Date birth;
    int count = 0;

    public User(String fullName, Date birth) {
        Date date = new Date();
        this.fullName = fullName;
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isUserAdult() {
        Date current = new Date();
        if (birth.getTime() +567648000000L<= current.getTime())
            return true;
        return false;
    }

    public void addAccountToUser(Account newAccount) {

        accounts[count++] = newAccount;

    }

    @Override
    public String toString() {
        return "Клиент " + "ФИО=" + fullName + ", дата рождения=" + birth;
    }

    public void printAccs() {
        for (Account a : accounts) {
           a.printAccount();
        }

    }
    public Account[] getAccs(){
        return accounts;
    }
    }

