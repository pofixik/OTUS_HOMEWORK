package Final;

import java.util.Map;

public class By100Handler {
    CollectionRuDictionary dictionaryClass=new CollectionRuDictionary();
    Map<Integer, String> dictNum =dictionaryClass.getRuNumbersDictionary();
    Helper helper=new Helper();


    public String handleProcess(int digital){
        int dec= helper.decideDozens(digital,10);
        String wordsFromDigital="";
        if (digital==dec)
            wordsFromDigital =dictNum.get(dec);//130
        else
        {
            if (digital < 20)
                wordsFromDigital = dictNum.get(digital);//130
            else
                wordsFromDigital = dictNum.get(dec) + " " + dictNum.get(digital - dec);//129
        }
        return wordsFromDigital;
    }


}
