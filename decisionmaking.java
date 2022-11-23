import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decisionmaking
{
    public static void main(String[] args) throws IOException {
        int marks;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Marks");
        marks=Integer.parseInt(br.readLine());
        if (marks>=90)
        {
            System.out.println("You get bicycle");
        } else if (marks >=70 && marks<90)
        {
            System.out.println("You get Chocolate");
        }
        else
        {
            System.out.println("You should study hard");
        }
    }
}
