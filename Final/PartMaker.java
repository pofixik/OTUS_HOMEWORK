package Final;

public class PartMaker {
    Helper helper = new Helper();
    By20Handler by20Handler= new By20Handler();
    By1000Handler by1000Handler= new By1000Handler();
    By100Handler by100Handler= new By100Handler();

    public String makePartFor1(int digital){
        int dec= helper.decideDozens(digital,10);
        int last=  helper.findLastCh(digital);
        int pred = helper.findSecondToLastCh(digital);
        String wordsFromDigital="";
        if ((( helper.fitLastCh(digital,1) && pred!=1) || digital == 1) ||
                (( helper.fitLastCh(digital,2) && pred!=1) || digital == 2))
        {
            if (digital <20) {
                wordsFromDigital = by20Handler.handleRussianProcess(digital);
            }
            else {
                wordsFromDigital = by20Handler.handleProcess(dec) + " " + by20Handler.handleRussianProcess(last);
            }
        }
        else {
            if (digital < 20)
                wordsFromDigital = by20Handler.handleProcess(digital);
            else
                wordsFromDigital = by100Handler.handleProcess(dec) + " " + by20Handler.handleProcess(digital);
            if (digital < 100)
                wordsFromDigital = by100Handler.handleProcess(digital);
            if (digital < 1000)
                wordsFromDigital = by1000Handler.handleProcess(digital);


        }
        return wordsFromDigital;
    }

    public String makePartFor2(int digital){
        int dec= helper.decideDozens(digital,10);
        int last=  helper.findLastCh(digital);
        int pred = helper.findSecondToLastCh(digital);
        String wordsFromDigital="";
        if
                (( helper.fitLastCh(digital,2) && pred!=1) || digital == 2)
        {
            if (digital <20) {
                wordsFromDigital = by20Handler.handleRussianProcess(digital);
            }
            else {
                wordsFromDigital = by20Handler.handleProcess(dec) + " " + by20Handler.handleRussianProcess(last);
            }
        }
        else {
            if (digital < 20)
                wordsFromDigital = by20Handler.handleProcess(digital);
            else
                wordsFromDigital = by100Handler.handleProcess(dec) + " " + by20Handler.handleProcess(digital);
            if (digital < 100)
                wordsFromDigital = by100Handler.handleProcess(digital);
            if (digital < 1000)
                wordsFromDigital = by1000Handler.handleProcess(digital);


        }
        return wordsFromDigital;
    }
    public String makePartUsual(int digital){
        int dec= helper.decideDozens(digital,10);
        int last=  helper.findLastCh(digital);
        int pred = helper.findSecondToLastCh(digital);
        String wordsFromDigital="";

            if (digital < 20)
                wordsFromDigital = by20Handler.handleProcess(digital);
            else
                wordsFromDigital = by100Handler.handleProcess(dec) + " " + by20Handler.handleProcess(digital);
            if (digital < 100)
                wordsFromDigital = by100Handler.handleProcess(digital);
            if (digital < 1000)
                wordsFromDigital = by1000Handler.handleProcess(digital);



        return wordsFromDigital;
    }
}
