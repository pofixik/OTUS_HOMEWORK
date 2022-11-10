package Final;

import java.util.Map;

public class Helper {
    CollectionRuDictionary dictionaryClass = new CollectionRuDictionary();
    Map<Integer, String> dictTh = dictionaryClass.getRuThousandsDictionary();



    public String addStringForThousand(int digital, String words) {
        int pred = findSecondToLastCh(digital);

        if ((fitLastCh(digital,1) && pred!=1) || digital == 1) {
            words = words + " " + dictTh.get(1);
        } else if ((fitLastCh(digital,2)  || fitLastCh(digital,3)  || fitLastCh(digital,4) ) && pred!= 1) {
            words = words + " " + dictTh.get(2);
        } else {
            words = words + " " + dictTh.get(5);
         }
        return words;
    }

    public boolean fitLastCh(int input, int lastCh){
        if (input%10==lastCh)
            return true;
        return false;
    }
    public int findSecondToLastCh(int digital) {
        String secondToLastStr = String.valueOf(digital);
        if (secondToLastStr.length() >= 2) {
            secondToLastStr = String.valueOf(secondToLastStr.charAt(secondToLastStr.length() - 2));
        }
        return Integer.parseInt(secondToLastStr);
    }

    public int findLastCh(int digital) {
        String lastStr = String.valueOf(digital);
        return Integer.parseInt(String.valueOf(lastStr.charAt(lastStr.length() - 1)));
    }
    public int decideDozens(int digital, int razr) {
        return ((int) digital / razr) * razr;
    }

    public int decideNumber(int digital, int razr) {
        return ((int) digital / razr);
    }
}
