package Questions;
import java.util.Scanner;

public class QuestionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question[] quiz = new Question[2];
		
		quiz[0] = new Question();
		quiz[0].addLine("Who was the inventor of Java");
		quiz[0].setAnswer("Jame Gosling");
		
		choiceQuestion question = new choiceQuestion(
				"In which country the inventor of Java was born");
		question.addAnswer("Autralia", false);
		question.addAnswer("Canada", true);
		question.addAnswer("The United State", false);
		question.addAnswer("Denmark", false);
		quiz[1] = question;
		
		Scanner in = new Scanner(System.in);
		for(Question q: quiz) {
			q.display();
			System.out.println("Your answer: ");
			String asnwerFromUser = in.nextLine();
			System.out.println(q.checkAnswer(asnwerFromUser));
		}
	}

}
