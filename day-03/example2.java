// Instance block
class example2
{
	// instance block
	{
		System.out.println("Instance-block");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		example1 e = new example1();
	}
}

//o/p : Main method 
     // Instance-block