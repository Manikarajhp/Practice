import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int rev = 0;
        while (n > 0){
            rev = (rev * 10) + (n%10);
            n = (int) n / 10;
        }
        System.out.println(rev);
    }
}