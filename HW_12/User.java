package HW_12;

import java.util.Date;

public class User {
    private static int loginId=0;
    private String fullName;

    private Date birth;


    public User(String fullName, Date birth){
        Date date = new Date();
        this.loginId=++loginId;
        this.fullName=fullName;
        this.birth=birth;
    }

    public Date getBirth() {
        return birth;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isUserAdult(){
        Date current = new Date();
        if (birth.getTime()-current.getTime()>=567648000000L)
            return true;
        return false;
    }

    public void addAccountToUser(User u, int number){
        Account acc= new Account(number, u.loginId);

    }
    @Override
    public String toString() {
         return "Клиент " + "ФИО=" + fullName + ", дата рождения=" + birth;
    }


}
