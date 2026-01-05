import java.util.Scanner;
class example3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr a number");
        int a = sc.nextInt();
        int cube = (int)Math.pow(a,3);
        System.out.println("the cube of given number is :"+cube);
    }
}