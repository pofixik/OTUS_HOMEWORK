package HW_11;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import static java.util.Collections.*;


public class Sort {



    public static void main(String[] args) {
        Sort s= new Sort();
          ArrayForBubble ar = new ArrayForBubble(10000);
          ar.fillRandom();
          CollectionForBubble col= new CollectionForBubble();
          col.setCollectionForBubble(10000);

          ar.print();

          ar.sort();

          ar.print();


        col.print();

        col.sortCollectionForBubble(col.collectionForBubble);

        col.print();



    }
}
