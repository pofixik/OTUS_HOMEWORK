package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest010 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testMillions() {
        String scenario = "V10. Проверка написания большого числа 991_234_567.99 р";
        try {
            String expected= "девятьсот девяносто один миллион двести тридцать четыре тысячи пятьсот шестьдесят семь рублей девяносто девять копеек";
            String x="991234567.99";
            String actual= prepareDigitToWordConversion.convertMainMethod(x, "RUB");
            if (actual.equals(expected))
                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
