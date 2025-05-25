import java.util.Scanner;

public class Revpal {
    public static int Reverse(int n){
        int rev = 0;
        while (n > 0){
            rev = (rev * 10) + (n%10);
            n = (int) n / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        if (Reverse(n) == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int count = 0;
        do{
            n = n + Reverse(n);
            count++;
        }while(!(isPalindrome(n)));
        System.out.println(count+","+n);
    }
}
