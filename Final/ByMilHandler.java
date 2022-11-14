package Final;

import java.math.BigInteger;

public class ByMilHandler {

    Helper helper = new Helper();
    PartMaker partMaker= new PartMaker();

    By1000Handler by1000Handler= new By1000Handler();


    public String handleProcess(int digital) {
        int thousands = helper.decideNumber((digital), 1000);

        String wordsFromDigital = helper.addStringForThousand(thousands, makeFirstPart(thousands));
        if ((digital-thousands*1000)!=0)
            wordsFromDigital= wordsFromDigital + " "+ by1000Handler.handleProcess(digital-thousands*1000);
        return wordsFromDigital;
    }

    public String makeFirstPart(int thousands ){

        return partMaker.makePartFor1(thousands);
    }

}
