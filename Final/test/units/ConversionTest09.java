package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest09 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testThousands2() {
        String scenario = "V9. Проверка написания тысяч 22649 р";
        try {
            String expected= "двадцать две тысячи шестьсот сорок девять рублей ноль копеек";
            String x="22649";
            String actual= prepareDigitToWordConversion.convertMainMethod(x, "RUB");
            if (actual.equals(expected))
                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
