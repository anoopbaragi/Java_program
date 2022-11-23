import java.util.Scanner;

public class areaofcircle
{
    public static void circle(int r)
    {
        double ac,pi=3.147;
        ac=pi*r*r;
        System.out.println("Area of Circle: "+ac);
    }

    public static void main(String[] args)
    {
        int rad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        rad=sc.nextInt();
        circle(rad);
    }
}
