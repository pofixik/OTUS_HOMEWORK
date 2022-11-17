package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest07 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testRublesV3() {
        String scenario = "V7. Проверка окончаний 125.6 р";
        try {
            String expected= "сто двадцать пять рублей шесть копеек";
            String x="125.6";
            String actual= prepareDigitToWordConversion.convertMainMethod(x, "RUB");
            System.out.println(actual);
            if (actual.equals(expected))
                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
