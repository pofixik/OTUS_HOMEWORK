package HW_14;

import java.io.*;
import java.net.*;
import java.util.concurrent.TimeoutException;

public class Sender {
    private String URI;
    int timeout;

    public void setTimeout(int timeout){
        this.timeout=timeout;
    }

    public int getTimeout(){
       return timeout;
    }


    private Message request;

    public void setRequest(Message request){
        this.request=request;
    }

    public void sendRequest(String url,Message request)  {
        try {
            HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);

            checkConnection(url,connection, request);

             }
        catch (TimeoutException e) {
            throw new RuntimeException("Случился таймаут",e);
        }

       catch (ConnectionException e) {
            throw new RuntimeException("2.Сайт не ответил", e);
        }
        catch (RuntimeException e) {
            throw new RuntimeException("3.Сайт не ответил", e);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void checkConnection(String url,HttpURLConnection connection, Message request) throws TimeoutException, ConnectionException {
        try {
            connection.setConnectTimeout(getTimeout());
            connection.setReadTimeout(getTimeout());
            connection.setRequestMethod("POST");

            Responser responser= new Responser();
            ///ветка с try-with-resource
             responser.readResponse(connection.getResponseCode());
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new ConnectionException();
            }

        }

       catch (ConnectionException e) {
         throw new RuntimeException("1.Сайт не ответил", e);
        }
        catch (RuntimeException e) {
            throw new RuntimeException("Проброс ошибки", e);
        }
        catch (UnknownHostException e) {
            System.out.println("Все сломано, выходим");
            System.exit(1);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }



}
