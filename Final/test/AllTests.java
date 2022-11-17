package Final.test;

import Final.test.units.*;

public class AllTests {
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest01().testNegative();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest02().testChars();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest03().testGetIntegerPart();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest04().testGetIntegerPart();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest05().testRublesV1();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest06().testRublesV2();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest07().testRublesV3();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest08().testThousands1();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest09().testThousands2();
        System.out.println("\n\n----------------------\n\n");

        new ConversionTest010().testMillions();
        System.out.println("\n\n----------------------\n\n");

    }
}
