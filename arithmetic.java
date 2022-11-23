import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmetic
{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Enter The Valur for A & B");
            int a,b;
            a = Integer.parseInt((br.readLine()));
            b=Integer.parseInt((br.readLine()));
            int c = a+b;
            int c1 = a-b;
            int c2 = a*b;
            int c3 = a/b;
            int c4 = a%b;
            System.out.println("Add : " +c+"\nSub : " +c1+ "\nMul : " +c2+"\nDiv : " +c3+"\nMod : " +c4);
        }

    }
}
