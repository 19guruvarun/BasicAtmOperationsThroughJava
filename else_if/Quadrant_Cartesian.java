class Quadrant_Cartesian 
{
	public static void main(String[] args) 
	{
		int x=10,y=2;
		if(x>0 && y>0)
			System.out.println("x and y is in First quadrant");
		else if(x<0 && y>0)
			System.out.println("x and y is in Second quadrant");
		else if(x<0 && y<0)
			System.out.println("x and y is in Third quadrant");
		else
			System.out.println("x and y is in Fourth quadrant");

	}
}
