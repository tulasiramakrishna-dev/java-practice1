// local block
//static block
//instance block
class example7
{
	// static block
	static
	{
		System.out.println("it is a Static block");
	}
	// instance block
	{
		System.out.println("it is a Instance block");
	}
	 public static void main(String[] args)
	{
		example7 e = new example7();
		// local block
		{
			System.out.println("It is a Local block");
		}
	}
}
