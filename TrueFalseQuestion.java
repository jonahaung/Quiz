import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	TrueFalseQuestion(String question, String answer) {
		this.question = "TRUE or FALSE: "+ question;
		correctAnswer = answer.toUpperCase(); // Initialize "correctAnswer" to the parameter "answer". Convert it to upper case
	}
	
	@Override
	String ask() {
		String answer = JOptionPane.showInputDialog(question);
		while (!isValidAnswer(answer)) {
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE");
			answer = ask();
		}
		return convertToValidAnswer(answer.toUpperCase());
	}

	// helper method to check valid answer
	private boolean isValidAnswer(String answer) {
		// the follow codes check whether the input answer is valid or not
		String[] validAnswers = { "f", "false", "False", "FALSE", "n", "no", "No", "NO", "t", "true", "T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES"}; // array of valid answers
		// isValidAnswer will be true if the answer contains in array of validAnswers
		for (String validAnswer : validAnswers) {
			if (validAnswer.equals(answer)) {
				return true;
			}
		}
		return false;
	}
	
	// Convert any valid answer representing true or yes to "TRUE" and 
	// any valid answer representing false or no to "FALSE"
	private String convertToValidAnswer(String answer) {
		if (answer.startsWith("F") || answer.startsWith("N")) {
			return "FALSE";
		}
		return "TRUE";
	}
}
