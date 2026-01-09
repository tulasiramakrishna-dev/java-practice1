// Write a java program to find out given number is even or odd.
import java.util.Scanner;
class example6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("The given number is even");
		}
		
		else
		{
			System.out.println("The given number is odd");
		}
		
	}
}