import java.util.Scanner;
public class Functionfact {
    public static int Fact(int n){
        if(n == 0 || n == 1)
            return 1;
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String arg[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(Fact(n));
    }
}
