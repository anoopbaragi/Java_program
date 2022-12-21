import java.util.Scanner;

class a
{
    public  int m(int x , int y)
    {
        return x+y;
    }
}
class b extends a
{
    public  int m1(int x, int y)
    {
        return x-y;
    }
}
class c
{
    public  int m2(int x,int y)
    {
        return  x*y;
    }
}
class d extends c
{
    public int m3(int x, int y)
    {
        return x/y;
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        b b1 = new b();
        d d1 = new d();
        System.out.println("Add:" +b1.m(3,4));
        System.out.println("Sub:" +b1.m1(10,2));
        System.out.println("Mul:" +d1.m2(5,3));
        System.out.println("Div:" +d1.m3(30,6));
    }
}
