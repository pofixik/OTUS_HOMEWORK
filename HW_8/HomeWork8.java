package HW_8;


public class HomeWork8 {
    int correctCount = 0, wrongCount = 0;
    public static void main(String[] args) {
        HomeWork8 hw=new HomeWork8();

        Question q1 = new Question(1, "Зачем крякозябликам бублики?",'D');
        Question q2 = new Question(2, "Какое самое опасное животное на планете?",'B');
        Question q3= new Question(3, "你会说汉语吗？",'B');
        Question q4 = new Question(4, "Какую песню можно спеть,если забыл паспорт?",'C');

        q1.addAnswers1(q1);
        q2.addAnswers2(q2);
        q3.addAnswers3(q3);
        q4.addAnswers4(q4);


        hw.process(q1);
        hw.process(q2);
        hw.process(q3);
        hw.process(q4);

        System.out.println("Результат: правильно " + hw.correctCount + ", неправильно " + hw.wrongCount);

    }

    public void process(Question q){
        q.getQuestion();
        q.showAnswers();
        if (q.readAndCheckAnswer(q))
            correctCount++;
        else wrongCount++;
    }
}
