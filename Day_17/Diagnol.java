import java.util.Scanner;

public class Diagnol {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1; i <= n; i++){
            int c = i;
            for(int j = n;j >= i; j--){
                System.out.print(c + " ");
                c += j;
            }
            System.out.println();
        }
    }
}

// 1 6 10 13 15
// 2 7 11 14
// 3 8 12
// 4 9
// 5