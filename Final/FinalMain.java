package Final;

public class FinalMain {


    public static void main(String[] args) {
        Currency preparation= new Currency();
        //preparation.readAndDefineCurrency();//определились с валютой
        DigitToWordConversion digitToWordConversion = new DigitToWordConversion();
        while (true)
        digitToWordConversion.convertDigitalsToWords();
    }
}
