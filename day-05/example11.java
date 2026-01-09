//wrte a java program to find the given number is positive or negitive.
import java.util.Scanner;
class example11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		if(n==0)
			System.out.println("The given number is nither positive nor negitive");
		else if(n>0)
			System.out.println("The given number is positive number");
		else
			System.out.println("The given number is negitive number");
		
	}
}