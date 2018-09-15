package me.interview.im;

public class InterviewQuestions 
{

	//print the first 10 fib numbers
	public void printFibanacci()
	{
		int firstNumb  = 0;
		int secondNumb = 1;
		int fibNumb;
		
		System.out.println(firstNumb);
		System.out.println(secondNumb);
		
		for(int x = 0; x <= 7; x++)
		{
			fibNumb = firstNumb + secondNumb;
			
			System.out.println(fibNumb);
			
			firstNumb  = secondNumb;
			secondNumb = fibNumb;
		}
	}
	
	public int isGreaterLesserOrEqual(Integer fistValue, Integer secondValue)
	{
		int returnValue = 0;
		int firstVal    = fistValue;
		int secondVal   = secondValue;
		
		if(firstVal > secondVal)
			returnValue = 1;
		else if(secondVal > firstVal)
			returnValue = 2;
		
		return returnValue;
	}
	
	public void findSmallestAndLargest()
	{
		int numbers [] = new int[] {22, 6, 3, 94, 23, 34, 84, 67, 18, 5};
		int largest  = 0;
		int smallest = 0;
		
		for(int x = 0; x < numbers.length; x++)
		{
			largest = numbers[x];
			smallest = numbers[x];
			
			for(int i = 0; i < numbers.length; i++)
			{
				if(largest < numbers[i])
					largest = numbers[i];
				if(smallest > numbers[i])
					smallest = numbers[i];
			}
		}
		
		System.out.println("largest is: " + largest);
		System.out.println("smallest is: " + smallest);
	}
}
