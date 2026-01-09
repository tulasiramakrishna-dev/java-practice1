// Write a java program to find out given age is eligible to vote or not?
import java.util.Scanner;
class example5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a person");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("The person is eligible for vote");
		}
		
		else
		{
			System.out.println("The person is not eligible for vote");
		}
		
	}
}