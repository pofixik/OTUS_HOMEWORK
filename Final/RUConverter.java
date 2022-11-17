package Final;


import java.math.BigInteger;

public class RUConverter implements CurrConverter {

    By100Handler by100Handler=new By100Handler();
    By20Handler by20Handler= new By20Handler();
    ByMilHandler byMilHandler= new ByMilHandler();
    By1000Handler by1000Handler= new By1000Handler();
    ByBilHadler byBilHadler= new ByBilHadler();
    RubAddCurrency rubAddCurrency = new RubAddCurrency();
    PartMaker partMaker= new PartMaker();

    public String makeUserInputFromDigitalToWords(int integerPartOfAmount, int floatPartOfAmount, String userCurrency){

        String finalString="";

        finalString= makeMainPartFromDigital(integerPartOfAmount,  userCurrency)+" " +makeAddPartFromDigital(floatPartOfAmount,  userCurrency);

        return finalString;
    }

    public String makeMainPartFromDigital(int rubles, String userCurrency){

        return rubAddCurrency.fillMainPart(rubles,makeWordsFromDigital(rubles),  userCurrency);
    }
    public String makeAddPartFromDigital(int cents, String userCurrency){

        return rubAddCurrency.fillAddPart(cents,partMaker.makePartFor1(cents),  userCurrency);
    }

    public String makeWordsFromDigital(int digital){
        String wordsFromDigital="";

        if (digital<20){
            return by20Handler.handleProcess(digital);
        }
        if (digital<100){
            return by100Handler.handleProcess(digital);
        }
        if (digital<1000) {
               return by1000Handler.handleProcess(digital);
        }
        if (digital<1000_000) {

            return byMilHandler.handleProcess(digital);
        }
        if (digital<1000_000_000) {

            return byBilHadler.handleProcess(digital);
        }
        return wordsFromDigital;
    }


}
