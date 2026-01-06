// static block
// static block exicuted when class is loaded.
class example5
{
	// Instanace block
	{
		System.out.println("Instance-block");
	}
	// static block
	static
	{
		System.out.println("Static-block");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		example5 e = new example5();
	}
}
