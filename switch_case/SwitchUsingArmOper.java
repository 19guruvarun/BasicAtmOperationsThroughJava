import java.util.Scanner;
class  SwitchUsingArmOper
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two a and b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter a Arthematic operator symbol");
		int operator=sc.next().charAt(0);
		switch(operator){
			case '+':System.out.println("Addition of a and b "+(a+b));break;
			case '-':System.out.println("Substraction of a and b "+(a-b));break;
			case '*':System.out.println("Multiplication of a and b "+(a*b));break;
			case '%':System.out.println("Modulus of a and b "+(a%b));break;
			case '/':System.out.println("Division of a and b "+(a/b));break;
			
			default:System.out.println("Invalid symbol");

		}
	}
}
