import java.util.Scanner;

public class Trianglepat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = 1;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(k+" ");
                k++;
            }
            System.err.println();
        }
    }
}
