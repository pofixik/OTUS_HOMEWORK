package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest04 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testGetIntegerPart() {
        String scenario = "V4. Проверка вычисления дробной части";
        try {
            String expected= "25";
            String actual= String.valueOf(prepareDigitToWordConversion.getFloatPartOfAmount("19.25"));
            if (actual.equals(expected))

                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
