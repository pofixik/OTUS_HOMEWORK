package HW_8;

public class ConsoleUserOutput implements UserOutput{
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void print(String[] massive) {
        for (String a:massive){
            System.out.println(a);
        }

    }
}
