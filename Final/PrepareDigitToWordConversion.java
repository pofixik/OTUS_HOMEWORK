package Final;

import java.math.BigInteger;

public class PrepareDigitToWordConversion {
    private final UserInput userInput = new ConsoleUserInput();
    private final UserOutput userOutput = new ConsoleUserOutput();
    CollectionRuDictionary dictionaryClass=new CollectionRuDictionary();
    Helper helper= new Helper();
    public int getIntegerPartOfAmount (String amount){
        String userAmountInDigits = "";
        int index= amount.indexOf(".");
        if (index==-1)
            index=amount.length();
        for ( int i=0;  i<index;i++)
        {
            userAmountInDigits=userAmountInDigits+amount.charAt(i);
        }

        return Integer.parseInt(userAmountInDigits);
    }

    public int getFloatPartOfAmount (String amount){
        String userAmountInDigits = "";
        int index= amount.indexOf(".");

        for ( int i=(index+1);  i<amount.length();i++)
            {
            userAmountInDigits=userAmountInDigits+amount.charAt(i);
            }
        if (index==-1)
            userAmountInDigits="0";
        return Integer.parseInt(userAmountInDigits);

    }
    public String readAmount(){
        userOutput.print("Введите сумму цифрами (для копеек используйте точку, не более двух знаков после запятой): ");
        String userAmountInDigits = userInput.read();
        while (!userAmountInDigits.matches("(?<![-\\d])([0-9]*[.])?^\\d+(\\.\\d\\d)?(\\.\\d)?$")){
            userOutput.print("Что-то не то. Попробуйте еще раз");
            userAmountInDigits = userInput.read();
        }
        return (userAmountInDigits);
    }

public String convertMainMethod(String d, String userCurrency){
    dictionaryClass.initializeDictionaries();
    RUConverter ruConverter= new RUConverter();
   return ruConverter.makeUserInputFromDigitalToWords(getIntegerPartOfAmount(d),  getFloatPartOfAmount(d),  userCurrency) ;
}

    public void convertDigitalsToWords(String userCurrency){

        String d=readAmount();
        userOutput.print(convertMainMethod(d, userCurrency));

    }

}
