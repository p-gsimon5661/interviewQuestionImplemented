package me.interview.im;

public class Main {

	public static void main(String[] args) 
	{
		InterviewQuestions iq = new InterviewQuestions();
		
		System.out.println("print fibancci");
		iq.printFibanacci();
		System.out.println("");
		System.out.println("Is greater than, less than or equal");
		System.out.println( iq.isGreaterLesserOrEqual(78, 13) );
		System.out.println("");
		System.out.println("find smallest and largest");
		iq.findSmallestAndLargest();
	}
}