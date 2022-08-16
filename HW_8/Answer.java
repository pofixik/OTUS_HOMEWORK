package HW_8;

class Answer {
    private String text;


    public void setAnswer(String answer) {
        this.text  = answer;
    }
    public void showText() {
        System.out.println(". " +text);
    }


    private TestElement testElement;

    public void setTestElement(TestElement testElement) {
        this.testElement  = testElement;
    }

    public TestElement getTestElement() {
        return testElement;
    }
}