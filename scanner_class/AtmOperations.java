import java.util.Scanner;
class AtmOperations 
{
	public static void main(String[] args) 
	{
		double bal=1000;
		int pin=1234,dep,withdraw;
		long phNo=234567893;
		long phno;
		int pinNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a digit from 1 to 4");
		System.out.println("1 for Withdraw money");
		System.out.println("2 for Balance Enquiry");
		System.out.println("3 for Pin Change");
		System.out.println("4 to Deposit money");
		int digit=sc.nextInt();
		
		switch(digit)
		{
			case 1:
				System.out.println("Please Enter your Phone Number...");
				phno=sc.nextLong();
				System.out.println("Please Enter your Pin Number...");
			    pinNum=sc.nextInt();
					   if(pinNum==pin && phno==phNo)
						{
							  System.out.println("Please Enter the you want to withdraw");
							  withdraw=sc.nextInt();
							  if(withdraw<=(bal-1000))
								{
									bal=bal-withdraw;
									

								}
								else
									System.out.println("Insufficient Balance amount");
							  
								System.out.println("Your Transcation made succesfully....");

						 }
					   else
						{
							System.out.println("Please Enter valid details......");
					    }
						break;
					
			case 2:
				System.out.println("Please Enter your Phone Number...");
				phno=sc.nextLong();
				System.out.println("Please Enter your Pin Number...");
				pinNum=sc.nextInt();
					   if(pinNum==pin && phno==phNo)
						{
							  System.out.println("Your Available Balance "+bal);

						 }
					   else
						{
							System.out.println("Please Enter valid details......");
					    }
						break;

			case 3:
				System.out.println("Please Enter your Phone Number...");
				phno=sc.nextLong();
				System.out.println("Please Enter your Pin Number...");
				pinNum=sc.nextInt();
					   if(pinNum==pin && phno==phNo)
						{
						   System.out.println("Please Enter new pin"); 
						 int newPin=sc.nextInt(); 
						System.out.println("Please Renter new pin");
						int conPin=sc.nextInt();
							if(newPin==conPin)
								{
									pin=newPin;
								}
							else
								{
									System.out.println("Invalid entry of pin");

								}
								System.out.println("Your pin was updated succesfully");
						 }
					   else
						{
							System.out.println("Please Enter valid details......");
					    }
						break;
			case 4:
				 System.out.println("Please Enter your Phone Number...");
				phno=sc.nextLong();
				System.out.println("Please Enter your Pin Number...");
				pinNum=sc.nextInt();
					   if(pinNum==pin && phno==phNo)
						{
							  System.out.println("Enter the amount You want to deposit...");
							  dep=sc.nextInt();
							  bal=bal+dep;
							  System.out.println("Your Amount Deposited Sucessfully.....");
							  System.out.println("Your Total Balance amount "+bal);

						 }
					   else
						{
							System.out.println("Please Enter valid details......");
					    }
						break;
			default:
				System.out.println("Please Enter a valid digit......");
		}
		
	}
}
