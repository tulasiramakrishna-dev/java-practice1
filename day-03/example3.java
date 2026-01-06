// Instance block
class example3
{
	// instance block
	{
		System.out.println("Instance-block");
	}
	public static void main(String[] args)
	{
		example1 e1 = new example1();
		System.out.println("Main Method");
		example1 e2 = new example1();
	}
}
