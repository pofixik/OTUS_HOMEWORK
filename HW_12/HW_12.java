package HW_12;

import com.github.javafaker.Faker;

import java.util.*;


public class HW_12 {
    static List collectionForUser= new ArrayList<User>();
    static List collectionForAccounts= new ArrayList<Account>();
    static User u;
    static int kol=100;
    static List generateUsers(){
        User a;
        Account acc;
        Random random = new Random();
        for (int i=0; i<kol;i++) {
            a=new User(generateRandomName(), generateRandomBirth());
            collectionForUser.add(a);
            for (int j=0; j<2;j++) {
                acc=new Account(Integer.parseInt("4274" + random.nextInt(10000)));
                a.addAccountToUser(acc);
                collectionForAccounts.add(acc);
            }

        }
        return collectionForUser;
    }

    static Date generateRandomBirth(){
        Random random;
        Date    date;
        long    ms;
        random = new Random();

    // -631152000000 = January 1, 1950
        ms = -631152000000L + (Math.abs(random.nextLong()) % (65L * 365 * 24 * 60 * 60 * 1000));
        date = new Date(ms);
        return date;
    }

    static String generateRandomName(){
        Faker faker = new Faker();
        String name = faker.name().fullName();
        return name;
    }
    public static void main(String[] args) {
        generateUsers();
     //   System.out.println(collectionForUser);
        for (int i = 0; i < collectionForUser.size() - 1; i++) {
            User u=(User)collectionForUser.get(i);
            System.out.println("ФИО= "+u.getFullName()+" Дата Рождения "+ u.getBirth() +" Совершеннолетний: "+ u.isUserAdult());
             //u.printAccs();
            //System.out.println(collectionForUser.);

        }
        for (int i = 0; i < collectionForAccounts.size() - 1; i++) {
            Account acc = (Account) collectionForAccounts.get(i);
            acc.printAccount();

        }
    }}



