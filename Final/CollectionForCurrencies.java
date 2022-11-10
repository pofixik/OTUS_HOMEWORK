package Final;


import java.util.ArrayList;

import java.util.List;


public class CollectionForCurrencies {

    List collectionForCurrencies= new ArrayList<String>();
    private final UserOutput userOutput= new ConsoleUserOutput();

    public void setCollectionForCurrencies() {
        {
            collectionForCurrencies.add("RUB");
            collectionForCurrencies.add("EUR");
            collectionForCurrencies.add("USD");
        }

    }

    public void print() {
        userOutput.print("Выберите валюту: ");
        userOutput.print(collectionForCurrencies);
       }
}

