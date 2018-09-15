package me.interview.im;

//** This was created as part of the udacity android development multiscreen apps*/
public class ReportCard 
{
	private String english;
	private String englishLetterGrade;
	private double englishGrade;
	
	private String math;
	private String mathLetterGrade;
	private double mathGrade;
	
	private String biology;
	private String biologyLetterGrade;
	private double biologyGrade;
	
	public ReportCard() 
	{
		super();
	}
	
	public String getEnglish() 
	{
		return english;
	}
	
	public void setEnglish(String english) 
	{
		this.english = english;
	}
	
	public String getEnglishLetterGrade() 
	{
		return englishLetterGrade;
	}
	
	public void setEnglishLetterGrade(String englishLetterGrade) 
	{
		this.englishLetterGrade = englishLetterGrade;
	}
	
	public double getEnglishGrade() 
	{
		return englishGrade;
	}
	
	public void setEnglishGrade(double englishGrade) 
	{
		this.englishGrade = englishGrade;
	}
	
	public String getMath() 
	{
		return math;
	}
	
	public void setMath(String math) 
	{
		this.math = math;
	}
	
	public String getMathLetterGrade() 
	{
		return mathLetterGrade;
	}
	
	public void setMathLetterGrade(String mathLetterGrade) 
	{
		this.mathLetterGrade = mathLetterGrade;
	}
	
	public double getMathGrade() 
	{
		return mathGrade;
	}
	
	public void setMathGrade(double mathGrade) 
	{
		this.mathGrade = mathGrade;
	}
	
	public String getBiology() 
	{
		return biology;
	}
	
	public void setBiology(String biology) 
	{
		this.biology = biology;
	}
	
	public String getBiologyLetterGrade() 
	{
		return biologyLetterGrade;
	}
	
	public void setBiologyLetterGrade(String biologyLetterGrade) 
	{
		this.biologyLetterGrade = biologyLetterGrade;
	}
	
	public double getBiologyGrade() 
	{
		return biologyGrade;
	}
	
	public void setBiologyGrade(double biologyGrade) 
	{
		this.biologyGrade = biologyGrade;
	}

	@Override
	public String toString() 
	{
		return "ReportCard [english=" + english + ", englishLetterGrade=" + englishLetterGrade + ", englishGrade="
				+ englishGrade + ", math=" + math + ", mathLetterGrade=" + mathLetterGrade + ", mathGrade=" + mathGrade
				+ ", biology=" + biology + ", biologyLetterGrade=" + biologyLetterGrade + ", biologyGrade="
				+ biologyGrade + "]";
	}
}