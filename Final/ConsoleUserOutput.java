package Final;

import java.util.ArrayList;
import java.util.List;

public class ConsoleUserOutput implements UserOutput{
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void print(List collection) {
        System.out.println(collection+ " ");
    }


}
