public class method_invocation
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

    public static void main(String[] args)
    {
        add(20,30);
        sub(40,10);
        mul(20,5);
        div(40,2);
    }
}
