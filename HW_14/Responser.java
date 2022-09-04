package HW_14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Responser {
    Message response;

    public void setResponse(Message response){
        this.response=response;
    }
    public Message getResponse(){
       return response;
    }

    public void readResponse(int code) throws IOException {
        try (InputStream message = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        })
        {
            if (message.read()!=code){
                System.out.println("Ошибка");
            System.out.println(message);
        }}


    }
}
