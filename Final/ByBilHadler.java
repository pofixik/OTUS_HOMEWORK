package Final;

import java.math.BigInteger;

public class ByBilHadler {
     Helper helper = new Helper();
    PartMaker partMaker= new PartMaker();

    By1000Handler by1000Handler= new By1000Handler();

    public String handleProcess(int digital) {
        int millions = helper.decideNumber((digital), 1000000);
        int thousands = helper.decideNumber((digital-millions*1000_000), 1000);
        int hundr=digital-(millions*1000000+thousands*1000);

        String wordsFromDigital = helper.addStringForMillions(millions, makeFirstPart(millions));

        if (thousands!=0)
            wordsFromDigital=wordsFromDigital + " "+helper.addStringForThousand(thousands, makeSecondPart(thousands));

       if (hundr!=0)
        wordsFromDigital= wordsFromDigital + " "+ by1000Handler.handleProcess(hundr);
        return wordsFromDigital;
    }

    public String makeFirstPart(int millions ){
        return partMaker.makePartUsual(millions);
    }

    public String makeSecondPart(int thousands ) {
      return partMaker.makePartFor1(thousands);
    }
    }

