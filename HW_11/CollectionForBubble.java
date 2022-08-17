package HW_11;

import java.sql.Timestamp;
import java.util.*;

public class CollectionForBubble {


    List collectionForBubble= new ArrayList<Integer>();

    public void setCollectionForBubble(int elements) {
        Random random = new Random();
        for (int i =0;i<elements;i++){
            collectionForBubble.add(random.nextInt(10000));
        }

    }
    public void sortCollectionForBubble(List list) {
        System.out.println("Сортировка коллекцией");
        CheckTime ch=new CheckTime();
        Timestamp t1=ch.CheckTime();
    Collections.sort(list);
        Timestamp t2=ch.CheckTime();
        System.out.println("Время сортировки: "+ (t2.getTime()-t1.getTime()));
    }
    public void print() {

            System.out.print(collectionForBubble+ "");   //вывести в консоль

        System.out.println();
    }
}
