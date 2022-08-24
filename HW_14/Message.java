package HW_14;

public class Message {
    private String textMessage;
    private String UUID;


    Message( String header,String text){
        this.textMessage=text;
        this.header=header;
    }

    public String getMessageText(){
        return textMessage;
    }


}
