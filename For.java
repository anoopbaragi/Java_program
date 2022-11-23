import java.util.Scanner;

public class For
{
    public static void main(String[] args)
    {
        String str;
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        for (i =0;i<str.length();i++)
        {
            count++;
        }
        System.out.println(count);
    }
}
