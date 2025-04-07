import java.util.Scanner;

public class Squaresum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println((int)((n*(n + 1)*((2*n)+1))/6));
    }
}
