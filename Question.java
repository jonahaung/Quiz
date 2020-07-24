import javax.swing.JOptionPane;

public abstract class Question {

	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	// method that take the question and check the correct answer
	void check() { 
		nQuestions ++; // increment questions
		String answer = ask(); // call the "ask" method with one of its parameters
		if (answer.equals(correctAnswer)) {
			nCorrect ++; // increment correct answers
			JOptionPane.showMessageDialog(null,"Correct!"); // display message for correct answer
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer); // display message for incorrect answer
		}
	}

	// to display the number of questions and correct answers
	static void showResults() {
		// display the number of questions and the number of correct answers using the static member variables
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions ");
	}


	abstract String ask();
}
