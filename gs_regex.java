import java.util.Scanner;

class gs
{
    String str;
    String regex = "^[a-zA-Z]+$";

    public void set(String name)
    {
        if (name.matches(regex))
        {
            this.str = name;
        }
        else {
            System.out.println("Wrong Name");
        }
    }
    public String getStr()
    {
        return str;
    }
}
public class gs_regex {

    public static void main(String[] args)
    {
        String str1;
        int id_n;
        gs gsr= new gs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        str1=sc.next();
        gsr.set(str1);
    }
}