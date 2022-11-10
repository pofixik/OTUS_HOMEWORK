package Final;


import java.util.Map;

public class RURubConverter implements CurrConverter {
    Helper helper= new Helper();
    By100Handler by100Handler=new By100Handler();
    By20Handler by20Handler= new By20Handler();
    ByMilHandler byMilHandler= new ByMilHandler();
    By1000Handler by1000Handler= new By1000Handler();

    public String makeUserInputFromDigitalToWords(int integerPartOfAmount, int floatPartOfAmount){

        String finalString="";

        finalString= makeIntegerPartFromDigital(integerPartOfAmount);

        return finalString;
    }

    public String makeIntegerPartFromDigital(int rubles){

        return makeWordsFromDigital(rubles);
    }
    public String makeFloatPartFromDigital(int cents){

        return null;
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

        return wordsFromDigital;
    }


}
