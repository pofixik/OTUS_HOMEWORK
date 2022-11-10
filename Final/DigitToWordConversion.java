package Final;

public class DigitToWordConversion {
    private final UserInput userInput = new ConsoleUserInput();
    private final UserOutput userOutput = new ConsoleUserOutput();
    CollectionRuDictionary dictionaryClass=new CollectionRuDictionary();

    public int getIntegerPartOfAmount (double amount){
        return (int)amount;
    }
    public int getFloatPartOfAmount (int amount){
        return (int)amount%1;
    }
    public double readAmount(){
        userOutput.print("Введите сумму цифрами (для копеек используйте точку, не более двух знаков после запятой): ");
        String userAmountInDigits = userInput.read();
        while (!userAmountInDigits.matches("(?<![-\\d])([0-9]*[.])?^\\d+(\\.\\d\\d)?(\\.\\d)?$")){
            userOutput.print("Что-то не то. Попробуйте еще раз");
            userAmountInDigits = userInput.read();
        }
        return Double.parseDouble(userAmountInDigits);
    }

    public void convertDigitalsToWords(){
        dictionaryClass.initializeDictionaries();
        RURubConverter ruConverter= new RURubConverter();
        double d=readAmount();
        userOutput.print(ruConverter.makeUserInputFromDigitalToWords(getIntegerPartOfAmount(d),  getFloatPartOfAmount((int) d)));

    }

}
