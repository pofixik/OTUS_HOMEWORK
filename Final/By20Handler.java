package Final;

import java.util.Map;

/*
Обработчик чисел до 20
 */
public class By20Handler {
    CollectionRuDictionary dictionaryClass = new CollectionRuDictionary();
    Map<Integer, String> dictNum = dictionaryClass.getRuNumbersDictionary();
    Map<Integer, String> dictAdd = dictionaryClass.getRuSpecificNumbersDictionary();

    public String handleProcess(int dig) {

        String wordsFromDigital;
        wordsFromDigital = dictNum.get(dig);
        return wordsFromDigital;
    }

    public String handleRussianProcess(int dig) {
        String russianVersion="";
        if (dig == 1) {
            russianVersion = dictAdd.get(1);
            }
            if (dig == 2) {
                russianVersion = dictAdd.get(2);
            }
         return russianVersion;
    }

}
