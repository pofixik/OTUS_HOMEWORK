package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest03 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testGetIntegerPart() {
        String scenario = "V3. Проверка вычисления целой части";
        try {
            String expected= "19";
            String actual= String.valueOf(prepareDigitToWordConversion.getIntegerPartOfAmount("19.25"));
            if (actual.equals(expected))

                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
