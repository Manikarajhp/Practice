import java.util.Scanner;
public class Reversefact {
    public static void Rev(int n){
        String rev = "";
        while(n > 0){
            int last = n%10;
            rev = rev + last;
            n = (int) n/10;
        }
        System.out.println(rev);
    }
    public static void main(String a[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n == 0 || n == 1){
            System.out.print(1);
            return;
        }
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        if ((fact%10)%2 == 0 ){
            Rev(fact);
        }
        else{
            System.out.println(fact);
        }
    }
}
