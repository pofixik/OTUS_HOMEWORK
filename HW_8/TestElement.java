package HW_8;

public class TestElement {
    private Answer[] answers;
    private int max=0;
    private int rightAnswerIndex;
    private String question;

    public TestElement(String question, int max, int rightAnswerIndex){
        this.max=max;
        this.question=question;
        this.rightAnswerIndex=rightAnswerIndex;
        this.answers=new Answer[max];

    }

    public void addAnswer(String answerText) {
         Answer a = new Answer(answerText);
    }
    public void showAnswers(){
        for (int i=0; i<max;i++)
        {
            System.out.println(i+". "+ answers[i]);
        }

    }



    public boolean ask(){
        System.out.println(question);
        System.out.println("Варианты ответов: ");
        showAnswers();


        return true;
    }
}
