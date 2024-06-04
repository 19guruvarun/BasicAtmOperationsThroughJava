class  SwitchExp2
{
	public static void main(String[] args) 
	{
		String month="may";
		switch(month){
			case "nov":
			case "dec":
			case "jan":
			case "feb":System.out.println("Winter Season"); break;
			case "mar":
			case "apr":
			case "may":
			case "jun":System.out.println("Summer Season"); break;
			case "jul":
			case "aug":
			case "sep":

			case "oct":System.out.println("Rainy Season"); break;
			

			default:System.out.println("Invalid");
		}
	}
	}
