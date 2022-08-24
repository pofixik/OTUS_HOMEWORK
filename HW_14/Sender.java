package HW_14;


import com.sun.jdi.connect.Transport;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeoutException;

public class Sender {
    private String URI;
    int timeout;

    private void setTimeout(int timeout){
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
            checkConnection(url,connection);

            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream());
            wr.writeBytes(request.getMessageText());
            wr.close();
             }
        catch (TimeoutException e) {
            throw new RuntimeException("Случился таймаут",e);
        }
        catch (ConnectionException e) {
            throw new RuntimeException("2.Сайт не ответил", e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void checkConnection(String url,HttpURLConnection connection) throws TimeoutException, ConnectionException {
        try {
            connection.setConnectTimeout(getTimeout());
            connection.setReadTimeout(getTimeout());
            connection.setRequestMethod("POST");
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new ConnectionException("Resource is currently unavailable");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ConnectionException e) {
            throw new RuntimeException("1.Сайт не ответил", e);
        }

    }



}
