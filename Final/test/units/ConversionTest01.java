package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest01 {

    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testNegative() {
        String scenario = "V1. Ввод отрицательного числа";
        try {
            String actual = "-1";
             if (!actual.matches("(?<![-\\d])([0-9]*[.])?^\\d+(\\.\\d\\d)?(\\.\\d)?$"))
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
