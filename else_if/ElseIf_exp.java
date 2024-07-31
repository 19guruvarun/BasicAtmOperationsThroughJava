class ElseIf_exp 
{
	public static void main(String[] args) 
	{
		int a=1,b=2,c=3,d=4;
		if(a>b && a>c && a>d)//------> a is not greatest here
			System.out.println(a+" is largest");
		else if(b>a && b>c && b>d)//else if(b>c && b>d)-----------> so no need to check a only check with c and d
			System.out.println(b+" is largest");
		else if(c>b && c>a && c>d)
			System.out.println(c+" is largest");//else if(c>d)
		else
			System.out.println(d+" is large");
	}
}
