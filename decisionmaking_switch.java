import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decisionmaking_switch
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age,num;
        System.out.println("Enter the Number");
        age = Integer.parseInt((br.readLine()));
        if (age >=60)
        {
            num=1;
        }
        else if (age >30 && age<60)
        {
            num=2;
        }
        else {
            num=3;
        }
        switch (num)
        {
            case 1:
                    System.out.println("Retire");
                break;
            case 2 :
                    System.out.println("Work Hard");
                break;
            case 3 :
                    System.out.println("Enjoy you life");
                break;
            default:
                System.out.println("Invalid Age");
        }
    }
}