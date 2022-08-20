package HW_12;

import com.github.javafaker.Faker;

import java.util.*;

public class HW_12 {
    static List collectionForUser= new ArrayList<User>();
    static int kol=100;
    static List generateUsers(){

        User a;
        for (int i=0; i<kol;i++) {


            collectionForUser.add(new User(generateRandomName(), generateRandomBirth()));
        }
        return collectionForUser;
    }

    static Date generateRandomBirth(){
        Random random;
        Date    date;
        long    ms;
        random = new Random();

    // -631152000000 = January 1, 1950
    // Add up to 70 years to it (using modulus on the next long)
        ms = -631152000000L + (Math.abs(random.nextLong()) % (65L * 365 * 24 * 60 * 60 * 1000));

        date = new Date(ms);
        return date;
    }

    static String generateRandomName(){
        Faker faker = new Faker();

        String name = faker.name().nameWithMiddle();
        return name;
    }
    public static void main(String[] args) {
        generateUsers();
        System.out.println(collectionForUser);
        }

    }

