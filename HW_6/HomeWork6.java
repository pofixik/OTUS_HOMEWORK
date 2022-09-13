package HW_6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions = {
                "Зачем крякозябликам бублики?",
                "Какое самое опасное животное на планете?",
                "你会说汉语吗？",
                "Какую песню можно спеть,если забыл паспорт?"};


        String[][] answerOptions = {
                {"1", ". Потому что"},
                {"2", ". Для красоты"},
                {"3", ". Ради безопасности"},
                {"4", ". Это дело самих крякозябликов"},//true

                {"1", ". Бегемот"},
                {"2", ". Кубомедуза"},//true
                {"3", ". Тигр"},
                {"4", ". Кит"},

                {"1", ". Что?"},
                {"2", ". 你很棒"},//true
                {"3", ". Это все еще про крякозябликов?"},
                {"4", ". Не знаю"},

                {"1", ". Солнце Монако"},
                {"2", ". Ты пчела, я пчеловод"},
                {"3", ". Город сказка, город мечта"},//true
                {"4", ". Despasito"}

        };

        int[] correctAnswers = {3, 5, 9, 14};

        Scanner scanner = new Scanner(System.in);

        int step = 4;//шаг для выборки
        int k = 0;//работает только если у каждого вопроса по 4 ответа

        for (int currentQuestion = 0; currentQuestion < questions.length; currentQuestion++) {
            System.out.println(questions[currentQuestion]);
            System.out.println("Варианты ответов:");

            for (int currentAnswer = k; currentAnswer < (k + step); currentAnswer++) {
                System.out.print(answerOptions[currentAnswer][0] + answerOptions[currentAnswer][1] + " "); // обращение к конкретному элементу по индексу
                System.out.println();

            }
            k = k + step;
            System.out.print("Введите ответ: ");


            String s;
            s=scanner.nextLine();
            while (!s.matches("-?\\d+(\\.\\d+)?")){
                System.out.println("Что-то не то. Попробуйте еще раз");
                s = scanner.nextLine();
            }

            int ans = Integer.parseInt(s);
            System.out.println("Ваш ответ: " + ans);


            if (answerOptions[ans - 1][0].equals(answerOptions[correctAnswers[currentQuestion]][0])) {
                System.out.println("Верно!");
                correctCount++;
            } else {
                System.out.println("Ну как же так?:(");
                wrongCount++;
            }

            System.out.println();
        }


        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}


