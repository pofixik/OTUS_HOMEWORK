package Final;

import java.math.BigInteger;
import java.util.Map;

public class By1000Handler {
    CollectionRuDictionary dictionaryClass = new CollectionRuDictionary();
    Map<Integer, String> dictH = dictionaryClass.getRuHundredsDictionary();
    Helper helper = new Helper();
    By100Handler by100Handler=new By100Handler();

    public String handleProcess(int digital) {
        int hund = helper.decideDozens(digital, 100);
        String wordsFromDigital = "";
        if (digital < 100) {

            return (by100Handler.handleProcess(digital));

        } else {
            wordsFromDigital = dictH.get(hund);

            if (digital % 100 != 0) {

                return (wordsFromDigital + " " + by100Handler.handleProcess(digital - hund));
            }
            return wordsFromDigital;
        }
    }
}
