// Write a java program to find out given character is vowel or consonent.
import java.util.Scanner;
class example8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("the given character is vowel");
		else
			System.out.println("the given character is consonent");
	}
}