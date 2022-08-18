package HW_11;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import static java.util.Collections.*;


public class Sort {



    public static void main(String[] args) {
        Sort s= new Sort();
        int max=10000;
        ArrayForBubble ar = new ArrayForBubble(max);
        ar.fillRandom();

        CollectionForBubble col= new CollectionForBubble();
        col.setCollectionForBubble(max);

        ar.print();//первоначальный массив
        ar.sort();//отстортировали
        ar.print();//вывели


        col.print();//первоначальный лист
        col.sortCollectionForBubble(col.collectionForBubble);//отстортировали
        col.print();//вывели

    }
}
