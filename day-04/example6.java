//write a java to find max of three  numbers 
import java.util.Scanner;
class example6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		System.out.println("Enter a third number:");
		int c = sc.nextInt();
		//logic
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("the greatest number is :"+max);
	}
}