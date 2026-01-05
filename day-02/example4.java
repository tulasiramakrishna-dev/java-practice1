import java.util.Scanner;
class example4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the radius:");
        int r = sc.nextInt();
        double area = Math.PI * r *r;
        System.out.println("the areaof circle is:"+area);
    }
}