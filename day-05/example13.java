//Write a java program to accept six marks of a student then find out total , average and grade?

//i) if average is greater then equals to 70 then A grade.

//ii) if average is greater then equals to 50 then B grade.

//iii) if average is greater then equals to 35 then C grade.

//iv) if average is less then 35 then failed.

import java.util.Scanner;
class example13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the six marks of a student:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int m6 = sc.nextInt();
		
		int total=m1+m2+m3+m4+m5+m6;
		System.out.println("the total marks is: "+total);
		
		double average = (double)total/6;
		System.out.printf("the average is: %.2f",average);
		
		if(average>=70)
			System.out.println("\n Grade is A");
		
		else if(average>=50)
			System.out.println("\n Grade is B");
			
		else if(average>=35)
			System.out.println("\n Grade is c");
		
		else
			System.out.println("\n Failed");
		
		
	}
}