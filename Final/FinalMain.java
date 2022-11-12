package Final;

public class FinalMain {


    public static void main(String[] args) {
        Currency userCurrency= new Currency();

        userCurrency.readAndDefineCurrency();//определились с валютой

        PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();
        while (true)
        prepareDigitToWordConversion.convertDigitalsToWords(userCurrency.getCurrency());
    }
}
