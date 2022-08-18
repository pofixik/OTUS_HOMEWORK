package HW_8;
//TODO
public class Test {
    private TestElement[] questions;
    private final UserOutput userOutput= new ConsoleUserOutput();
    public Test(TestElement[] questions) {
        this.questions = questions;
    }


    private int rightAnswersCount=0;
    private int wrongAnswersCount=0;
    int count=0;
    public TestElement[] getQuestions() {
        return questions;
    }





    public void addTestElement(TestElement newTestElement,String question, int max, int rightAnswerIndex) {
        newTestElement.setTestElement(question,max,rightAnswerIndex);
        newTestElement.setTest(this);
        questions[count++]=newTestElement;
    }
    public void passTest(){

        for (int i=0;i< questions.length;i++){
            questions[i].ask();
            if (questions[i].readAndCheckAnswer())
                rightAnswersCount++;
            else wrongAnswersCount++;
        }
        userOutput.print("Результат: правильно " + rightAnswersCount + ", неправильно " + wrongAnswersCount);
    }







}
