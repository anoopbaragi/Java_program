import java.util.Scanner;

public class For_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int z=0,i;
        System.out.println("Enter the String");
        str = sc.next();
        str= str.toLowerCase();
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                z++;
            }
        }
        System.out.println(z);
    }
}
