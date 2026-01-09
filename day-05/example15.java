// Write a java program to find out given number is positive or negative by using nested if stmt?
import java.util.Scanner;
class example15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println("The given number is positive number");
				System.exit(0);
			}
			
			System.out.println("The given number is negitive number");	
		}
		
	}
}