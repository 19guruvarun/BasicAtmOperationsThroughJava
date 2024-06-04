class Results 
{
	public static void main(String[] args) 
	{
		int marks=88;
		if(marks>=95 && marks<=100)
			System.out.println("The person got 1st Rank");
		else if(marks>=90 && marks<95)
			System.out.println("The person got 2nd Rank");
		else if(marks>=70 && marks<90)
			System.out.println("The person got Distinction");
		else if(marks>=60 && marks<70)
			System.out.println("The person got 1st Class with Distinction");
		else if(marks>=50 && marks<60)
			System.out.println("The person got 1st Class");
		else if(marks>=40 && marks<50)
			System.out.println("The person got 2nd Class");
		else if(marks>=35 && marks<40)
			System.out.println("The person Passed");
		else
			System.out.println("The person failed");


	}
}
