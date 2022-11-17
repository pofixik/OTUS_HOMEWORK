package Final;

import java.util.Map;
import java.util.Scanner;

public interface CurrConverter {

    default String makeUserInputFromDigitalToWords(int integerPartOfAmount, int floatPartOfAmount,String userCurrency) {
        String finalString="";
        return finalString;
    }

    default String makeIntegerPartFromDigital(int amount){

        return makeWordsFromDigital(amount);
    }
    default String makeFloatPartFromDigital(int cents){

        return null;
    }
    default String makeWordsFromDigital(int digital){
        String wordsFromDigital="";

        return wordsFromDigital;
    }
}
