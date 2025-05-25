import java.util.*;
public class Palindrome {
    public static void main(String arg[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int rev = 0, org = n;
        while (n > 0){
            rev = (rev * 10) + (n%10);
            n = (int) n / 10;
        }
        if (org == rev)
            System.out.println("palindrome.");
        else
            System.out.println("Not palindrome.");
    }
}
