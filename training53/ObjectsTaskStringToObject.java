import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ObjectsTaskStringToObject {
    private ObjectsTaskStringToObject(){}

    public static <T> T makeObjectFromString(String input, T anyObject) {
        // System.out.println((T) anyObject.getClass());
        T var1=(T)input;
        T a= (T)new Integer(123);
        System.out.println(var1.getClass());

        Class<?> aClass = anyObject.getClass();
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c: constructors){
            Class[] parameterTypes = c.getParameterTypes();
            if (parameterTypes.length==1 && parameterTypes[0].equals(String.class))
            {
                try {

                    return (T) c.newInstance(input);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    return null;
                }
            }

        }
        return null;

    }
    /*    }
        Реализуйте метод, который получает на вход строку и объект любого типа и затем приводит строку
        к такому же типу и возвращает получившийся объект.
        Если у класса переданного объекта нет конструктора, который
        принимает строковую переменную - вернуть null*/
//sonarlint
    public static void main(String[] args) {
        System.out.println("Создаем число из строки: " + makeObjectFromString("15", 1));
        System.out.println("Создаем булево из строки: " + makeObjectFromString("true", true));
        System.out.println("Создаем список из строки, должно не получиться: " + makeObjectFromString("1,2,3", new ArrayList<>()));
    }
}