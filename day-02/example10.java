//Q) Write a java program to perform swapping of two numbers?
import java.util.Scanner;
class example10
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int b = sc.nextInt();
		System.out.println("Before swapping a="+a+"b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a="+a+"b="+b);
	}	
}

