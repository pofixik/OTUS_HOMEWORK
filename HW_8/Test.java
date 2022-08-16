package HW_8;

public class Test {
    private TestElement[] questions;
    private int rightAnswersCount;

    public TestElement[] getQuestions() {
        return questions;
    }


    public void passTest(Test test){

        for (int i=0;i< questions.length;i++){
            test.questions[i].ask();

        }
    }

    public void prepareTest(){

        TestElement q1= new TestElement("Зачем крякозябликам бублики?",4,3);
        q1.addAnswer(new Answer(), "Потому что");
        q1.addAnswer(new Answer(), "Для красоты");
        q1.addAnswer(new Answer(), "Ради безопасности");
        q1.addAnswer(new Answer(), "Это дело самих крякозябликов");

        TestElement q2= new TestElement("Какое самое опасное животное на планете?",4,1);
        q2.addAnswer(new Answer(), "Бегемот");
        q2.addAnswer(new Answer(), "Кубомедуза");
        q2.addAnswer(new Answer(), "Тигр");
        q2.addAnswer(new Answer(), "Кит");

        TestElement q3= new TestElement("你会说汉语吗？",5,1);
        q3.addAnswer(new Answer(), "Что");
        q3.addAnswer(new Answer(), "你很棒");
        q3.addAnswer(new Answer(), "Это все еще про крякозябликов?");
        q3.addAnswer(new Answer(), "Не знаю");
        q3.addAnswer(new Answer(), "Тест на 5 ответов");

        TestElement q4= new TestElement("Какую песню можно спеть,если забыл паспорт?",4,2);
        q4.addAnswer(new Answer(), "Солнце Монако");
        q4.addAnswer(new Answer(), "Ты пчела, я пчеловод");
        q4.addAnswer(new Answer(), "Город сказка, город мечта");
        q4.addAnswer(new Answer(), "Despasito");

        questions=new TestElement[]{q1,q2,q3,q4};


        }



    int correctCount = 0, wrongCount = 0;
    public static void main(String[] args) {

        Test myTest=new Test();
        myTest.prepareTest();
        myTest.passTest(myTest);






    }

}
