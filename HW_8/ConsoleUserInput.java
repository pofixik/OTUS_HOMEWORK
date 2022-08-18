package HW_8;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput{
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ответ: ");
        String s;
        s = scanner.nextLine();
        while (!s.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("Что-то не то. Попробуйте еще раз");
            s = scanner.nextLine();
        }
        return s;
    }
}
