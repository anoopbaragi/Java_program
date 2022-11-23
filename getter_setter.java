import java.util.Scanner;

class  demo
{
    int r;
    double pi;
    double area;
    public void set(int ra,double pii)
    {
        this.r=ra;
        this.pi=pii;
        this.area=pi*r*r;
    }
//    public int getR()
//    {
//        return r;
//    }
//    public double getPi()
//    {
//        return pi;
//    }
    public double getArea()
    {
        return area;
    }
}
public class getter_setter
{
    public static void main(String[] args)
    {
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The radius");
        radius=sc.nextInt();
        demo d = new demo();
        d.set(radius,3.147);
        System.out.println("Area of Circle:" +d.getArea());
    }
}
