
public class Quiz {

	public static void main(String[] args) {
		
		// Question 1
		Question question1 = new MultipleChoiceQuestion( 
			"Name the most popular programming language used for developing Android Apps.", // question
			"Python", // A
			"Swift", // B
			"Java", // C
			"HTML", // D
			"C++", // E
			"C"); // Correct Answer
		
		// Question 2
		Question question2 = new MultipleChoiceQuestion( 
			"Name the most popular programming language used for developing iOS Apps.", // question
			"Python", // A
			"Swift", // B
			"Java", // C
			"HTML", // D
			"C++", // E
			"B"); // Correct Answer
		
		// Question 3
		Question question3 = new MultipleChoiceQuestion( 
			"Name the most popular programming language used in Machine Learning.", // question	
			"Python", // A
			"Swift", // B
			"Java", // C
			"HTML", // D
			"C++", // E		
			"A"); // Correct Answer			
			
		// Question 4
		Question question4 = new MultipleChoiceQuestion( 
			"Latest programming language used for creating native Android apps apart from Java.", // question	
			"Python", // A
			"Swift", // B
			"Java", // C
			"Kotlin", // D
			"C++", // E		
			"D"); // Correct Answer	
		
		// Question 5
		Question question5 = new MultipleChoiceQuestion( 
			"Createing native apps for Android and iOS using React", // question	
			"Flutter", // A
			"Swift", // B
			"Java", // C
			"Kotlin", // D
			"Rect Native", // E		
			"E"); // Correct Answer	
		
		// Question 6
		Question question6 = new MultipleChoiceQuestion( 
			"Google’s UI toolkit for building natively compiled applications for mobile, web, and desktop from a single codebase.", // question	
			"Flutter", // A
			"Swift", // B
			"Java", // C
			"Kotlin", // D
			"Rect Native", // E		
			"A"); // Correct Answer
		
		// True/False Questions
		Question trQuestion1 = new TrueFalseQuestion("HTML is a programming language.", "FALSE");
		Question trQuestion2 = new TrueFalseQuestion("OOP stands for Object-Oriented Programming.", "true");
		Question trQuestion3 = new TrueFalseQuestion("Java is an Object-Oriented Programming Language.", "true");
		Question trQuestion4 = new TrueFalseQuestion("Swift Programming Language is used to create Android Apps.", "false");
		
		// Calling Multiple Choice Questions
		question1.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question6.check();
		// Calling True/False Questions
		trQuestion1.check();
		trQuestion2.check();
		trQuestion3.check();
		trQuestion4.check();
		
		// show the summary results
		Question.showResults();
		

	}
	
	
}
