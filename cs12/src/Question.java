import java.util.ArrayList;

public class Question {
    private String question;
    private Answer answer;
    private Answer wrongA;
    private Answer wrongB;
    ArrayList<Answer> Answers;
    public Question(String question, Answer answer, Answer wrongA, Answer wrongB){
        this.question = question;
        this.answer = answer;
        this.wrongA = wrongA;
        this.wrongB = wrongB;
        Answers = new ArrayList<>();
        Answers.add(answer);
        Answers.add(wrongA);
        Answers.add(wrongB);
    }
    public void ask(){
        System.out.println(this.question);
        double num1 = Math.random()*3;
        double num2 = Math.random()*3;
        double num3 = Math.random()*3;
        int choice1 = (int)num1;
        int choice2 = (int)num2;
        int choice3 = (int)num3;
        while (choice1 == choice2 || choice1 == choice3 || choice2 == choice3){
            num2 = Math.random()*3;
            choice2 = (int)num2;
            num3 = Math.random()*3;
            choice3 = (int)num3;
        }
        Answer an1 = Answers.get(choice1);
        Answer an2 = Answers.get(choice2);
        Answer an3 = Answers.get(choice3);
        System.out.println("(1)" + an1.answer + "  (2)" + an2.answer + "  (3)" + an3.answer);
    }
}