package Final;


import java.util.Locale;

public class Currency {
    private String currency;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    private final UserInput userInput = new ConsoleUserInput();
    private final UserOutput userOutput = new ConsoleUserOutput();

    public CollectionForCurrencies availCurrencies = new CollectionForCurrencies();

    public void showAvailCurrencies() {
        availCurrencies.setCollectionForCurrencies();
        availCurrencies.print();

    }

    public String readAndDefineCurrency() {
/*        showAvailCurrencies();
        String userCurrency = userInput.read();
        if (availCurrencies.collectionForCurrencies.contains(userCurrency.toUpperCase())) {
            userOutput.print("Вы выбрали валюту "+ userCurrency.toUpperCase());

        }
        setCurrency(userCurrency);*/
        String userCurrency = "RUB";
        setCurrency(userCurrency);
        System.out.println(getCurrency());
        return userCurrency;

    }
}
