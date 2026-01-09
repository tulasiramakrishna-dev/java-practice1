// Write a java program to find out given number number is even  or oddd
import java.util.Scanner;
class example7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n%2!=0)
		{
			System.out.println("The given number is odd");
		}
		
		else
		{
			System.out.println("The given number is  not a odd");
		}
		
	}
}