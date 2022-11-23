import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the Number");
        n = Integer.parseInt((br.readLine()));
        switch (n)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");

            default:
                System.out.println("Invalid Number");
        }
    }
}
