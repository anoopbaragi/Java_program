import java.util.Scanner;

public class try_catch
{
    public static void main(String[] args)
    {
        int num,z;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        //int [] arr = {1,2,3};
        try
        {
            z=40/num;
            System.out.println(z);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
}
