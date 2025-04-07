import java.util.Scanner;
public class Sumseries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 1,sum = 0;
        while (n > 0) {
            sum += (i*n);
            n--;
            i++;
        }
        System.out.println(sum);
    }
}
