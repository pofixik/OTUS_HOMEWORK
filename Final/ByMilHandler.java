package Final;

import java.util.Map;

public class ByMilHandler {
    CollectionRuDictionary dictionaryClass = new CollectionRuDictionary();
    Map<Integer, String> dictM = dictionaryClass.getRuMillionsDictionary();
    Helper helper = new Helper();

    By20Handler by20Handler= new By20Handler();
    By1000Handler by1000Handler= new By1000Handler();

    By100Handler by100Handler= new By100Handler();
    public String handleProcess(int digital) {
        int thousands = helper.decideNumber(digital, 1000);

        String wordsFromDigital = helper.addStringForThousand(thousands, makeFirstPart(thousands));

        wordsFromDigital= wordsFromDigital + " "+ by1000Handler.handleProcess(digital-thousands*1000);
        return wordsFromDigital;
    }

    public String makeFirstPart(int thousands ){
        int dec= helper.decideDozens(thousands,10);
        int last= helper.findLastCh(thousands);
        int pred =helper.findSecondToLastCh(thousands);
        String wordsFromDigital="";
        if (((helper.fitLastCh(thousands,1) && pred!=1) || thousands == 1) ||
                ((helper.fitLastCh(thousands,2) && pred!=1) || thousands == 2))
        {
            if (thousands <20) {
                wordsFromDigital = by20Handler.handleRussianProcess(thousands);
            }
            else {
                wordsFromDigital = by20Handler.handleProcess(dec) + " " + by20Handler.handleRussianProcess(last);
            }
        }
        else {
            if (thousands < 20)
                wordsFromDigital = by20Handler.handleProcess(thousands);
            else
                wordsFromDigital = by100Handler.handleProcess(dec) + " " + by20Handler.handleProcess(thousands);
            if (thousands < 100)
                wordsFromDigital = by100Handler.handleProcess(thousands);
            if (thousands < 1000)
                wordsFromDigital = by1000Handler.handleProcess(thousands);


        }
        return wordsFromDigital;
    }

}
