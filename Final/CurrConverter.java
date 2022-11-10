package Final;

import java.util.Map;
import java.util.Scanner;

public interface CurrConverter {

    default String makeUserInputFromDigitalToWords(int integerPartOfAmount, int floatPartOfAmount) {
        String finalString="";
        return finalString;
    }

    default String makeIntegerPartFromDigital(int rubles){

        return makeWordsFromDigital(rubles);
    }
    default String makeFloatPartFromDigital(int cents){

        return null;
    }
    default String makeWordsFromDigital(int digital){
        String wordsFromDigital="";
        Map<Integer, String> dictSimple ;
        Map<Integer, String> dictHundreds ;
        Map<Integer, String> dictThousands ;
        Map<Integer, String> dictMillions ;
        Map<Integer, String> dictAdditional ;


        return wordsFromDigital;
    }
}
