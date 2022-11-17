package Final.test.units;

import Final.PrepareDigitToWordConversion;

public class ConversionTest08 {
    private final PrepareDigitToWordConversion prepareDigitToWordConversion = new PrepareDigitToWordConversion();

    public void testThousands1() {
        String scenario = "V8. Проверка написания тысяч 1234.61 р";
        try {
            String expected= "одна тысяча двести тридцать четыре рубля шестьдесят одна копейка";
            String x="1234.61";
            String actual= prepareDigitToWordConversion.convertMainMethod(x, "RUB");
            if (actual.equals(expected))
                System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
