package HW_8;

public class TestElement {
    private Answer[] answers;
    private int max=0;
    private int rightAnswerIndex;
    private String question;

    int count=0;

    public TestElement(String question, int max, int rightAnswerIndex){
        this.max=max;
        this.question=question;
        this.rightAnswerIndex=rightAnswerIndex;
        this.answers=new Answer[max];

    }
    private Test test;

    public void setTest(Test test) {
        this.test  = test;
    }

    public Test getTest() {
        return test;
    }
    public void addAnswer(Answer newAnswer, String text) {
        newAnswer.setAnswer(text);
        newAnswer.setTestElement(this);
        answers[count++]=newAnswer;
    }


    public void showAnswers(){
        for (int i=0; i<max;i++)
        {
            System.out.print(i+1);
            answers[i].showText();

        }

    }



    public boolean ask(){
        System.out.println();
        System.out.println(question);

        System.out.println("Варианты ответов: ");
        System.out.println();
        showAnswers();

        return true;
    }



}
