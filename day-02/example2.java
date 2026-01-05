import java.util.Scanner;
class example2
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number:");
         int a = sc.nextInt();
         int square = (int)Math.pow(a,2);
         System.out.println("the square of given number is:"+square);
    }
}


