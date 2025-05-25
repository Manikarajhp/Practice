import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int row = n/2;
        for(int i = 0;i <= row;i++){
            for(int j = 0;j < i;j++){
                System.out.print(" ");
            }
            int k = 1;
            while(k <= n){
                System.out.print(k);
                k++;
            }
            n -= 2;
            System.out.println();
        }
    }
}
