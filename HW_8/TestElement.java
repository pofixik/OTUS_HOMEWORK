package HW_8;

import java.util.Scanner;

public class TestElement {
    private Answer[] answers;
    private int max=0;
    private int rightAnswerIndex;
    private String question;

    private final UserInput userInput= new ConsoleUserInput();
    private final UserOutput userOutput= new ConsoleUserOutput();
    int count=0;

    public TestElement(String question, int max, int rightAnswerIndex){
        this.max=max;
        this.question=question;
        this.rightAnswerIndex=rightAnswerIndex+1;
        this.answers=new Answer[max];

    }
    public void setTestElement(String question, int max, int rightAnswerIndex){
        this.max=max;
        this.question=question;
        this.rightAnswerIndex=rightAnswerIndex+1;
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
        answers[count++]=newAnswer;
    }


    public void showAnswers() {
        for (int i = 0; i < max; i++) {
            System.out.print(i + 1);
            answers[i].showText();

        }
    }
    public boolean readAndCheckAnswer(){
       String s=userInput.read();

        if (String.valueOf(rightAnswerIndex).equals(s)) {
            System.out.println("Верно!");
            return true;
        }
        else {
            System.out.println("Неверно");
            return false;
        }
    }



    public void ask(){
        userOutput.print(question);
        userOutput.print("Варианты ответов: ");
        System.out.println();
        showAnswers();

    }



}
