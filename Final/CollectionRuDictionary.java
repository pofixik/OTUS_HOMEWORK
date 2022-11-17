package Final;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class CollectionRuDictionary {
    private static Map<Integer, String> ruNumbersDictionary = new HashMap<>();
    private static Map<Integer, String> ruSpecificNumbersDictionary = new HashMap<>();
    private static Map<Integer, String> ruHundredsDictionary = new HashMap<>();
    private static Map<Integer, String> ruThousandsDictionary = new HashMap<>();
    private static Map<Integer, String> ruMillionsDictionary = new HashMap<>();
    private static Map<Integer, String> ruKopeykaDictionary = new HashMap<>();
    private static Map<Integer, String> ruRublesDictionary = new HashMap<>();
    private static Map<Integer, String> ruDollarsDictionary = new HashMap<>();
    private static Map<Integer, String> ruCentsDictionary = new HashMap<>();
    public  Map<Integer, String> getRuNumbersDictionary() {
        return ruNumbersDictionary;
    }
    public  Map<Integer, String> getRuSpecificNumbersDictionary() {
        return ruSpecificNumbersDictionary;
    }
    public  Map<Integer, String> getRuHundredsDictionary() {
        return ruHundredsDictionary;
    }

    public  Map<Integer, String> getRuThousandsDictionary() {
        return ruThousandsDictionary;
    }

    public  Map<Integer, String> getRuRublesDictionary() {
        return ruRublesDictionary;
    }

    public  Map<Integer, String> getRuMillionsDictionary() {
        return ruMillionsDictionary;
    }

    public  Map<Integer, String> getRuKopeykaDictionary() {
        return ruKopeykaDictionary;
    }
    public  Map<Integer, String> getRuDollarsDictionary() {
        return ruDollarsDictionary;
    }
    public  Map<Integer, String> getRuCentsDictionary() {
        return ruCentsDictionary;
    }
    public void initializeDictionaries() {
        ruSpecificNumbersDictionary = Map.ofEntries(
                entry(1, "одна"),
                entry(2, "две")

        );
        ruKopeykaDictionary = Map.ofEntries(
                entry(5, "копеек"),
                entry(1, "копейка"),
                entry(2, "копейки")
        );
        ruRublesDictionary = Map.ofEntries(
                entry(1, "рубль"),
                entry(2, "рубля"),
                entry(5, "рублей")
        );
        ruDollarsDictionary = Map.ofEntries(
                entry(1, "доллар"),
                entry(2, "доллара"),
                entry(5, "долларов")
        );
        ruCentsDictionary = Map.ofEntries(
                entry(1, "цент"),
                entry(2, "цента"),
                entry(5, "центов")
        );
        ruMillionsDictionary = Map.ofEntries(
                entry(1, "миллион"),
                entry(2, "миллиона"),
                entry(5, "миллионов")
        );
        ruThousandsDictionary = Map.ofEntries(
                entry(1, "тысяча"),
                entry(5, "тысяч"),
                entry(2, "тысячи")
        );
        ruHundredsDictionary = Map.ofEntries(
                entry(100, "сто"),
                entry(200, "двести"),
                entry(300, "триста"),
                entry(400, "четыреста"),
                entry(500, "пятьсот"),
                entry(600, "шестьсот"),
                entry(700, "семьсот"),
                entry(800, "восемьсот"),
                entry(900, "девятьсот")
        );
        ruNumbersDictionary=Map.ofEntries(
                entry(0, "ноль"),
                entry(1, "один"),
                entry(2, "два"),
                entry(3, "три"),
                entry(4, "четыре"),
                entry(5, "пять"),
                entry(6, "шесть"),
                entry(7, "семь"),
                entry(8, "восемь"),
                entry(9, "девять"),
                entry(10, "десять"),
                entry(11, "одиннадцать"),
                entry(12, "двенадцать"),
                entry(13, "тринадцать"),
                entry(14, "четырнадцать"),
                entry(15, "пятнадцать"),
                entry(16, "шестнадцать"),
                entry(17, "семнадцать"),
                entry(18, "восемнадцать"),
                entry(19, "девятнадцать"),
                entry(20, "двадцать"),
                entry(30, "тридцать"),
                entry(40, "сорок"),
                entry(50, "пятьдесят"),
                entry(60, "шестьдесят"),
                entry(70, "семьдесят"),
                entry(80, "восемьдесят"),
                entry(90, "девяносто")

        );
    }


}
