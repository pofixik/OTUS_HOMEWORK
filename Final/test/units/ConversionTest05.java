package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest05 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testRublesV1() {
        String scenario = "V5. Проверка окончаний 1.1р";
        try {
            String expected= "один рубль одна копейка";
            String x="1.1";
            String actual= prepareDigitToWordConversion.convertMainMethod("1.1", "RUB");
            if (actual.equals(expected))
                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
