package Questions;
public class choiceQuestion extends Question{
	private int choiceCount;
	
	public choiceQuestion(String questionText){
		super.addLine(questionText);
	}
	
	/**
	 * Add an answer choice to this question
	 * @param choice: the choice to add
	 * @param correct: true if choice is correct
	 */
	public void addAnswer(String choice, boolean correct) {
		
		choiceCount++;
		super.addLine(choiceCount + ": " + choice);
		if(correct) {
			super.setAnswer(choice);
		}
	}
}
