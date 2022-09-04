package HW_12;

import com.github.javafaker.Faker;

import java.util.*;


public class HW_12 {
    static int kol = 100;
    private static Map<User, User> personAccounts = new HashMap<>();
    private static Map<Account, User> accountPersons = new HashMap<>();


    private static Map<User, User> setPersonAccounts() {

        for (int i = 0; i < kol; i++) {
            Account a= new Account(i);
            User user = new User(generateRandomName(), generateRandomBirth(), a);
            personAccounts.put(user, user);
            setAccountPersons(accountPersons, a,user);

        }
        Account newacc1= new Account(888888888);
        Account newacc2= new Account(919191919);
        User userTest = new User("Karimov Vitaliy", new Date(-631152000), new Account[]{newacc1, newacc2});
        personAccounts.put(userTest, userTest);
        accountPersons.put(newacc1, userTest);
        accountPersons.put(newacc2, userTest);
        return personAccounts;
    }

    private static Map<Account, User> setAccountPersons(Map<Account, User> accountPersons, Account a, User user) {
        accountPersons.put(a, user);
        return accountPersons;
    }



    static Date generateRandomBirth() {
        Random random;
        Date date;
        long ms;
        random = new Random();

        // -631152000000 = January 1, 1950
        ms = -631152000000L + (Math.abs(random.nextLong()) % (65L * 365 * 24 * 60 * 60 * 1000));
        date = new Date(ms);
        return date;
    }

    static String generateRandomName() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        return name;
    }

    public static void main(String[] args) {
        Map<User, User> personAccounts = setPersonAccounts();

        System.out.println(personAccounts);// все созданные клиенты
        System.out.println(personAccounts.keySet());// все созданные счета

        User userTest = new User("Karimov Vitaliy", new Date(-631152000));
        User accountFromUser = personAccounts.get(userTest);//нашли клиента
        accountFromUser.getAccounts();//нашли счета по клиенту


        Account accTest1= new Account(888888888, 0.0);
        Account accTest2= new Account(919191919, 0.0);

        User userFromAccount1= accountPersons.get(accTest2);//нашли клиента по счету 1
        User userFromAccount2= accountPersons.get(accTest1);//нашли клиента по счету 2
        System.out.println(userFromAccount1);
        System.out.println(userFromAccount2);

    }


}
