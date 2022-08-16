package HW_8;

import java.util.Scanner;

public class TestElement {
    private Answer[] answers;
    private int max=0;
    private int rightAnswerIndex;
    private String question;

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
        newAnswer.setTestElement(this);
        answers[count++]=newAnswer;
    }


    public void showAnswers() {
        for (int i = 0; i < max; i++) {
            System.out.print(i + 1);
            answers[i].showText();

        }
    }
    public boolean readAndCheckAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ответ: ");
        String s;
        s=scanner.nextLine();
        while (!s.matches("-?\\d+(\\.\\d+)?")){
            System.out.println("Что-то не то. Попробуйте еще раз");
            s = scanner.nextLine();
        }

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
        System.out.println(question);
        System.out.println("Варианты ответов: ");
        System.out.println();
        showAnswers();

    }



}
