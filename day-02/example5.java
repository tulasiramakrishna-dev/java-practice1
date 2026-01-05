import java.util.Scanner;
class example5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the raius:");
        int r = sc.nextInt();
        double perimeter = 2 * Math.PI *r;
        System.out.println("the perimeter of circle is:"+perimeter);
    }
}