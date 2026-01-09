// John visited a big showroom to buy the shoe. 
//But he has a myth that if shoe cost is divisible by 3 and 5 then only he can purchase the shoe. 
//Write a java program to find out John can buy the shoe or not.
import java.util.Scanner;
class example9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of a shoe:");
		int cost = sc.nextInt();
		
		if(cost%3==0 && cost%5==0)
			System.out.println("john can buy the shoe");
		else
			System.out.println("john cannot buy the shoe");
		
	}
}