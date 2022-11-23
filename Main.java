import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException {
        int i,j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Enter The Valur for I & J");
            i = Integer.parseInt((br.readLine()));
            j=Integer.parseInt((br.readLine()));
            System.out.println("The Value of I :" +i+ "\nThe value of J :" +j);

        }
    }
}