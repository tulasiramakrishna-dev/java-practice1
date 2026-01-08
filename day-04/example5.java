//write a java to find max of two numbers 
import java.util.Scanner;
class example5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		//logic
		int max = (a>b)?a:b;
		System.out.println("the greatest number is :"+max);
	}
}