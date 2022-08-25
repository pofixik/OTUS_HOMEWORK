package HW_14;

import java.net.MalformedURLException;

import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {

            Message testMessage = new Message("UU12332", "Test text");
            Sender sender = new Sender();

            ////// rethrow
            ///выведем стек
            //вывод текста с try-with-resource
            sender.setTimeout(1000);
            sender.sendRequest(String.valueOf(new URL("http://www.yahoo.com/")), testMessage);

            ///выход из приложения
            ///Все сломано, выходим
            sender.setTimeout(1000);
            sender.sendRequest(String.valueOf(new URL("http://www.yhoo")), testMessage);

            //////Вывод ошибки
            //java.net.SocketTimeoutException: connect timed out

            //sender.setTimeout(10);
            //sender.sendRequest(String.valueOf(new URL("http://www.yahoo.com/")), testMessage);


    }
}
