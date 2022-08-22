package HW_12;

import com.github.javafaker.Faker;

import java.util.*;


public class HW_12 {
    static int kol = 100;

    private static Map<Integer, User> getPersonAccounts() {
        Map<Integer, User> personAccounts = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < kol; i++) {
            User user = new User(generateRandomName(), generateRandomBirth());
            personAccounts.put((new Account(Integer.parseInt("4274" + random.nextInt(10000)))).getNumber(), user);


        }
        User userTest = new User("Karimov Vitaliy", new Date(-631152000));
        personAccounts.put((new Account(888888888, 0.0)).getNumber(), userTest);
        personAccounts.put((new Account(919191919, 0.0)).getNumber(), userTest);
        return personAccounts;
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
        Map<Integer, User> personAccounts = getPersonAccounts();
        System.out.println(personAccounts);// все созданные клиенты
        System.out.println(personAccounts.keySet());// все созданные счета

        User userTest = new User("Karimov Vitaliy", new Date(-631152000));
        getAccounts(personAccounts,userTest);//нашли счета по клиенту

        Account accTest1= new Account(888888888, 0.0);
        Account accTest2= new Account(919191919, 0.0);

        System.out.println(personAccounts.get(accTest1.getNumber()));//нашли клиента по обоим счетам
        System.out.println(personAccounts.get(accTest2.getNumber()));

    }


    public static void getAccounts(Map<Integer, User> personAccounts, User desiredObject) {
        Set<Map.Entry<Integer, User>> entrySet = personAccounts.entrySet();
        for (Map.Entry<Integer, User> pair : entrySet) {
            if (desiredObject.equals(pair.getValue())) {
                System.out.println(pair.getKey());
             }
        }

    }
}
