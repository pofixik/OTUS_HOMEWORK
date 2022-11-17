package Final;
import java.util.Scanner;

public interface UserInput {
    default String read() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
