//if statement grfeatest of two numbers
import java.util.Scanner;
class example2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  first number");
		int a = sc.nextInt();
		System.out.println("Enter a second number");
		int b= sc.nextInt();
		if(a>b)
		{
			System.out.println("the greatest number is"+a);
		}
		if(a<b)
		{
			
			System.out.println("the greatest number is"+b);
		}
		
	
	
	}
}