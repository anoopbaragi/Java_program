import java.util.Scanner;

public class method_overloading
{
    public static int cal(int x ,int y,int z,int q ,int w)
    {
        int add =x+y+z+q+w;
        return add;
    }

    public static int cal(int x ,int y,int z,int s)
    {
        int sub =x-y-z-s;
        return sub;
    }
    public static float cal(float x ,float y,float z)
    {
        float mul =x*y*z;
        return mul;
    }
    public static int cal(int x ,int y)
    {
        int div =x/y;
        return div;
    }

    public static void main(String[] args)
    {
//        System.out.println("Add:" +cal(15,25,30,40,10));
//        System.out.println("Sub:" +cal(45,10,5,2));
//        System.out.println("Mul:" +cal((float) 10.2,2.5f,3.5f));
//        System.out.println("Div:" +cal(60,3));
        //object creation
        method_overloading ob = new method_overloading();
        System.out.println("Add");
        System.out.println(ob.cal(60,3,2,10,5));
        System.out.println("Sub");
        method_overloading ob1 = new method_overloading();
        System.out.println(ob1.cal(20,1,3,2));
        System.out.println("MUL");
        method_overloading ob2 = new method_overloading();
        System.out.println(ob2.cal((float) 2.2,1.0f,3.0f));
        System.out.println("DIV");
        method_overloading ob3 = new method_overloading();
        System.out.println(ob3.cal(40,2));
    }
}