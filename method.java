class moolya
{
    public static void add(int x,int y)
    {
       int z;
       z=x+y;
        System.out.println("Add:" +z);
    }
    public static void sub(int x,int y)
    {
        int z;
        z=x-y;
        System.out.println("Sub:" +z);
    }
    public static void mul(int x,int y)
    {
        int z;
        z=x*y;
        System.out.println("Mul:" +z);
    }
    public static void div(int x,int y)
    {
        int z;
        z=x/y;
        System.out.println("Div:" +z);
    }
    public  static int add1(int x,int y)
    {
        int z;
        z=x+y;
        return z;
    }
}
public class method
{
    public static void main(String[] args)
    {

      moolya.add(20,40);
      moolya.sub(40,10);
      moolya.mul(10,50);
      moolya.div(50,30);
      System.out.println("ADD:"+moolya.add1(30,20));
    }
}
