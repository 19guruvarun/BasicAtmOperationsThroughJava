class GradingSystem 
{
	public static void main(String[] args) 
	{
		int marks=88;
		if(marks>=90 && marks<=100)
			System.out.println("The person passed with A Grade");
		else if(marks>=75 && marks<90)
			System.out.println("The person passed with B Grade");
		else if(marks>=60 && marks<75)
			System.out.println("The person passed with C Grade");
		else if(marks>=45 && marks<60)
			System.out.println("The person passed with D Grade");
		else if(marks>=35 && marks<45)
			System.out.println("The person passed with E Grade");
		else
			System.out.println("The person failed with F Grade");


	}
}
