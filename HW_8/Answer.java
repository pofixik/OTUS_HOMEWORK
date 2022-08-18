package HW_8;

class Answer {
    private String text;
    private final UserOutput userOutput= new ConsoleUserOutput();
    public void setAnswer(String answer) {
        this.text  = answer;
    }
    public void showText() {
       userOutput.print(". " +text);
    }
}