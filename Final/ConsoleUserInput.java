package Final;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    public String read() {
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();

        return s;
    }
}
