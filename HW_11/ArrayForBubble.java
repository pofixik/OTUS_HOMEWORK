package HW_11;

import java.sql.Timestamp;
import java.util.Random;

class ArrayForBubble {
    private int[] massive;

    public ArrayForBubble(int elements) {
        massive = new int[elements];

    }
    public void fillRandom(){
        Random random = new Random();
        for (int i = 0; i < massive.length; i++)
            massive[i]=random.nextInt(10000);
    }


    public void swap(int a, int b) {
        int temp = massive[a];
        massive[a] = massive[b];
        massive[b] = temp;
    }

    public void sort() {
        System.out.println("Сортировка массивом");
        CheckTime ch=new CheckTime();
        Timestamp t1=ch.CheckTime();
        for (int i = massive.length - 1; i >= 1; i--) {  //Внешний цикл
            for (int j = 0; j < i; j++) {       //Внутренний цикл
                if (massive[j] > massive[j + 1])
                    swap(j, j+1);
            }
        }
        Timestamp t2=ch.CheckTime();
        System.out.println("Время сортировки: "+ (t2.getTime()-t1.getTime()));
    }

    public void print() {
        for (int a:massive) {    //для каждого элемента в массиве
            System.out.print(a + " ");   //вывести в консоль

        }
        System.out.println();
    }

}