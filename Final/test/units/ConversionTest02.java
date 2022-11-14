package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest02 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testChars() {
        String scenario = "V2. Ввод символов, проверка на дурака";
        try {
            String actual = "пять";

            if (!actual.matches("(?<![-\\d])([0-9]*[.])?^\\d+(\\.\\d\\d)?(\\.\\d)?$"))

                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
