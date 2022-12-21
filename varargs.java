public class varargs
{
    public  int prod(int ...arr)
    {
        int product = 1;
        for (int i =0;i<arr.length;i++)
        {
            //product=product*arr[i];
            product=arr.length;
            System.out.print("["+arr[i]+"]");
        }
        return product;
    }
    public static void main(String[] args)
    {
        varargs v =new varargs();
        //int x=v.prod(3,5,8);
        int y=v.prod(3,5,6,8);
        //System.out.println(x);
        System.out.println("\nArray length:" +y);
    }
}
