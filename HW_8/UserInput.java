package HW_8;

import java.util.Scanner;

public interface UserInput {
     static String read(String message){
         Scanner scanner = new Scanner(System.in);
         String userInput=scanner.nextLine();
        return userInput;
     }
}
