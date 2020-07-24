
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
	
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n"; // Initialize "question" using the "query" parameter followed by each choice parameter, "a"-"e".
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		
		correctAnswer = answer.toUpperCase(); // Initialize "correctAnswer" to the parameter "answer". Convert it to upper case
	}
	
	// method that ask a question and return an upper-cased answer
	String ask() {
		String answer = JOptionPane.showInputDialog(question).toUpperCase();
		while (!isValidAnswer(answer)) {
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			answer = ask();
		}
		return answer;
	}
	
	// helper method to check valid answer
	private boolean isValidAnswer(String answer) {
		if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
			return true;
		}
		return false;
	}
}
