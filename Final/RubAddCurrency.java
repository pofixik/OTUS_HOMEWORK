package Final;

import java.util.Map;

public class RubAddCurrency {
    CollectionRuDictionary dictionaryClass = new CollectionRuDictionary();
    Map<Integer, String> dictR ;
    Map<Integer, String> dictK ;

    Helper helper= new Helper();

    public void chooseCurrencyDictionary(String userCurrency){

        if (userCurrency.equals("RUB")) {
            dictR = dictionaryClass.getRuRublesDictionary();
            dictK = dictionaryClass.getRuKopeykaDictionary();
        }
        if (userCurrency.equals("USD")) {
            dictR = dictionaryClass.getRuDollarsDictionary();
            dictK = dictionaryClass.getRuCentsDictionary();
        }

    }

    public String fillMainPart(int amount, String words, String userCurrency){
        chooseCurrencyDictionary(userCurrency);
        return addStringForAmount( amount,  words,  userCurrency, dictR);
    }

    public String fillAddPart(int amount, String words, String userCurrency){
        chooseCurrencyDictionary(userCurrency);
        return addStringForAmount( amount,  words,  userCurrency,dictK);
    }

    public String addStringForAmount(int amount, String words, String userCurrency,  Map<Integer, String> local){

        int pred = helper.findSecondToLastCh(amount);
        if ((helper.fitLastCh(amount, 1) && pred != 1) || amount == 1) {
            words = words + " " + local.get(1);
        } else if ((helper.fitLastCh(amount, 2) || helper.fitLastCh(amount, 3) || helper.fitLastCh(amount, 4)) && pred != 1) {
            words = words + " " + local.get(2);
        } else {
            words = words + " " + local.get(5);
        }
        return words;


    }


}
