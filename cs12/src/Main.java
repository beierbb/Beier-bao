import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questionArrayList = new ArrayList<>();
        Question plus = new Question("What is 1+1?", new Answer(true, "2"), new Answer(false, "3"),new Answer(false, "1"));
        Question minus = new Question("What is 678-349?", new Answer(true, "329"), new Answer(false, "328"),new Answer(false, "327"));
        Question multiply = new Question("What is 46*67?", new Answer(true, "3082"), new Answer(false, "3036"),new Answer(false, "2970"));
        Question area = new Question("What is the top three largest countries(in order from largest to smallest)?",
                new Answer(true, "Russia, Canada, China"), new Answer(false, "Russia, Canada, America"),new Answer(false, "Russia, China, Canada"));
        Question capital = new Question("What is the capital of Chile?", new Answer(true, "Santiago"), new Answer(false, "Buenos Alires"),new Answer(false, "Lima"));
        Question derivative = new Question("What is the derivative of 10000?", new Answer(true, "0"), new Answer(false, "10000"),new Answer(false, "1"));
        List<Question> questionList = Arrays.asList(plus, minus, multiply, area, capital, derivative);
        ArrayList<Question> defaultArrayList = new ArrayList<>(questionList);
        String questionInput;
        String answer;
        String wrongA;
        String wrongB;
        System.out.println("Welcome to Quizdom! It is your choice to make a quiz or run the quiz we provided. " +
                "Enter 1 for adding a question and 2 for running the quiz.");
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Type in the question you want to ask: ");
                questionInput = scanner.nextLine();
                System.out.println("The answer for your question: ");
                answer = scanner.nextLine();
                System.out.println("The first wrong answer for your question: ");
                wrongA = scanner.nextLine();
                System.out.println("The second wrong answer for your question: ");
                wrongB = scanner.nextLine();
                questionArrayList.add(new Question(questionInput, new Answer(true, answer), new Answer(false, wrongA), new Answer(false, wrongB)));
                System.out.println("More questions?(1 for more, 2 for enough)");
                int moreQ = Integer.parseInt(scanner.nextLine());
                if (moreQ == 2) {
                    break;
                }
            }
            System.out.println("Do you want to run your own quiz or the default quiz?(Enter 1 for your own and 2 for the default.)");
            int want = Integer.parseInt(scanner.nextLine());
            if (want == 1) {
                for (Question questionAsk : questionArrayList) {
                    questionAsk.ask();
                    int attempted = Integer.parseInt(scanner.nextLine());
                    if (questionAsk.Answers.get(attempted - 1).isCorrect) {
                        System.out.println("*****Correct!*****");
                    } else {
                        System.out.println("*****Wrong!*****");
                    }
                }
            }
        }
        for (Question defaultAsk : defaultArrayList) {
            defaultAsk.ask();
            int attempted2 = Integer.parseInt(scanner.nextLine());
            if (defaultAsk.Answers.get(attempted2 - 1).isCorrect) {
                System.out.println("*****Correct!*****");
            } else {
                System.out.println("*****Wrong!*****");
            }
        }
        System.out.println("Thank You!");
    }
}