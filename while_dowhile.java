public class while_dowhile
{
    public static void main(String[] args)
    {
        int i=1;
        while (i<=10)
        {
            System.out.println(i*7);
            i++;
        }
        do
        {
            System.out.println(i*10);
            i++;
        }
        while (i<10);
    }
}
