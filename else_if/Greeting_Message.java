class Greeting_Message 
{
	public static void main(String[] args) 
	{

		int time=22;
		if(time>=0 && time<=10)
			System.out.println("Hi Good Morning");
		else if(time>=12 && time<=15)
			System.out.println("Hi Good Afternoon");
		else if(time>=17 && time<=20)
			System.out.println("Hi Good Evening");
		else if(time>=21 && time<=23)
			System.out.println("Good Night Bye!");
		else
			System.out.println("No Greetings");
	}
}
