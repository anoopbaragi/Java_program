import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decisionmaking_exp {
    public static void main(String[] args) throws IOException {
        int a, b, c, d, e, sum;
        float avg;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 5 Numbers");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());

        sum = a + b + c + d + e;
        avg = sum / 5;
        System.out.println("The Avg : " + avg);
        if (avg >=90)
        {
            System.out.println("FCD");
        }
        else if (avg>=75 && avg<90)
        {
            System.out.println("First Class");
        }
        else
        {
            System.out.println("Second Class");
        }
        {

        }
    }
}
