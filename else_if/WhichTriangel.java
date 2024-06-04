class WhichTriangel 
{
	public static void main(String[] args) 
	{
		int a=2,b=4,c=4;
		if(a!=b && b!=c && c!=a)
			System.out.println("scallene triangel");
		else if((a==b && b!=c) || (b==c && b!=a)||(a==c && a!=b))
			System.out.println("isoseles");
		else 
			System.out.println("scalene");
	}
}
