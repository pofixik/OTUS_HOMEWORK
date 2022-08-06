package HW_6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions =  {
            "Зачем крякозябликам бублики?",
            "Какое самое опасное животное на планете?",
            "你会说汉语吗？",
            "Какую песню можно спеть,если забыл паспорт?"};


        String[][] answerOptions = {
                {"1", ". Потому что"},
                {"2", ". Для красоты"},
                {"3", ". Ради безопасности"},
                {"4", ". Это дело самих крякозябликов"},//true

                {"1",". Бегемот"},
                {"2",". Кубомедуза"},//true
                {"3",". Тигр"},
                {"4", ". Кит"},

                {"1", ". Что?"},
                {"2",". 你很棒"},//true
                {"3",". Это все еще про крякозябликов?"},
                {"4",". Не знаю"},

                {"1",". Солнце Монако"},
                {"2",". Ты пчела, я пчеловод"},
                {"3",". Город сказка, город мечта"},//true
                {"4",". Despasito"}

        };

        int[] correctAnswers ={3,5,9,14};

        Scanner scanner = new Scanner(System.in);
        int k=0;//работает только если у каждого вопроса по 4 ответа
        int step=4;//шаг для выборки ответов

        for(int i = 0; i < questions.length ; i++) {
            System.out.println(questions[i]);
            System.out.println("Варианты ответов:");
            for (int h = k; h < step; h++) {
                for (int j = 0; j < answerOptions[h].length; j++) {
                    System.out.print(answerOptions[h][j] + " "); // обращение к конкретному элементу по индексу

                }
                System.out.println();
            }
            step=step+4;
            k=k+4;
            System.out.print("Введите ответ: ");
            int ans=Integer.parseInt(scanner.nextLine());
            System.out.println("Ваш ответ: "+ans);


            if (answerOptions[ans-1][0].equals(answerOptions[correctAnswers[i]][0])){
                System.out.println("Верно!");
                correctCount++;
            }
            else {
                System.out.println("Ну как же так?:(");
                wrongCount++;
            }

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

