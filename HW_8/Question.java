package HW_8;

import java.util.Scanner;

class Question {
    int id;
    String description;
    Answer[] answers;
    char rightAnswer;


    public Question(int id, String description, char rightAnswer) {
        this.id = id;
        this.description = description;
        this.rightAnswer=rightAnswer;
    }

    public boolean readAndCheckAnswer(Question q){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ответ: ");
        char ans=scanner.nextLine().charAt(0);
        if (ans==q.rightAnswer) {
            System.out.println("Верно!");
            return true;
        }
        else {
            System.out.println("Неверно");
            return false;
        }

    }

    public void getQuestion(){
        System.out.println(id+". "+description);
    }

    public void setAnswer(Answer[] a) {
        this.answers = a;

    }

    public void showAnswers(){
        for (Answer answer:answers)
            System.out.println( answer.id +". "+ answer.description);
    }
    public void addAnswers1(Question q) {

        Answer[] ans = new Answer[4];
        ans[0] = new Answer('A', "Потому что");
        ans[1] = new Answer('B', "Для красоты");
        ans[2] = new Answer('C', "Ради безопасности");
        ans[3] = new Answer('D', "Это дело самих крякозябликов");
        q.setAnswer(ans);

    }

    public void addAnswers2(Question q)  {
        Answer[] ans = new Answer[4];
        ans[0] = new Answer('A', "Бегемот");
        ans[1] = new Answer('B', "Кубомедуза");
        ans[2] = new Answer('C', "Тигр");
        ans[3] = new Answer('D', "Кит");
        q.setAnswer(ans);
    }
    public void addAnswers3(Question q)  {
        Answer[] ans = new Answer[4];
        ans[0] = new Answer('A', "Что?" );
        ans[1] = new Answer('B', "你很棒" );
        ans[2] = new Answer('C', "Это все еще про крякозябликов?");
        ans[3] = new Answer('D', "Не знаю");
        q.setAnswer(ans);
    }
    public void addAnswers4(Question q)  {
        Answer[] ans = new Answer[4];
        ans[0] = new Answer('A', "Солнце Монако");
        ans[1] = new Answer('B', "Ты пчела, я пчеловод");
        ans[2] = new Answer('C', "Город сказка, город мечта");
        ans[3] = new Answer('D', "Despasito");
        q.setAnswer(ans);
    }

}
