package HW_14;

public class Responser {
    Message response;

    public void setResponse(Message response){
        this.response=response;
    }
    public Message getResponse(){
       return response;
    }

    public void readResponse(String UUID, String response) {
        try{
            Message message= new Message(UUID, response);
            setResponse(message);
            System.out.println(getResponse().getMessageText());

        }
        catch (Exception e){
            System.out.println("Не смогли получить сообщение"+ e.getMessage());
        }
    }
}
