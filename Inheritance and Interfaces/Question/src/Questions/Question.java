package Questions;

public class Question {
	private String text;
	private String answer;
	/**
	 * Constructs a question with empty text and empty answer
	 */
	public Question() {
		text ="";
		answer ="";
	}
	
	/**
	 * Set the answer for this question
	 * @param correctResponse is the provided answer
	 */
	
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	
	/**
	 * Checks a given response if it is correct.
	 * @param response is the response to be checked
	 * @return true if the response was correct, else false
	 */
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	
	/**
	 * Add a line of text to question text
	 * @param line is the question
	 */
	public void addLine(String line) {
		text = text + line + "\n";
	}
	
	public void display() {
		System.out.println(text);
	}
}

