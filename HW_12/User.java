package HW_12;

import java.util.Date;

public class User  {

    private String fullName;
    private Account[] accounts=new Account[2];
    private Date birth;

    public User(String fullName, Date birth) {
        Date date = new Date();
        this.fullName = fullName;
        this.birth = birth;
    }

    public boolean isUserAdult() {
        Date current = new Date();
        if (birth.getTime() +567648000000L<= current.getTime())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;

        User otherPerson = (User) other;
        return this.fullName.equals(otherPerson.fullName);
    }

    @Override
    public String toString() {
        return "Клиент " + "ФИО=" + fullName + ", дата рождения=" + birth +" Больше 18? " + isUserAdult();
    }


}

