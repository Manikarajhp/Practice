import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int f1 = 0, f2 = 1;
        for(int i = 0; i < n; i++){
            System.out.print(f1 + " ");
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
