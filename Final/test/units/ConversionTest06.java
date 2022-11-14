package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest06 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testRublesV2() {
        String scenario = "V6. Проверка окончаний 2.22 р";
        try {
            String expected= "два рубля двадцать одна копейка";
            String x="2.21";
            String actual= prepareDigitToWordConversion.convertMainMethod(x, "RUB");
        if (actual.equals(expected))
                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
