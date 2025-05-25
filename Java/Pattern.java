import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int space = n-1,i,j,k,o;
        for(i = 0;i < n; i++){
            for(j = 0; j < space; j++){
                System.out.print(" ");
            }
            for(k = i+1; k <= n-space+i; k++){
                System.out.print(k);
            }
            for(o = k-2; o >= i+1; o--){
                System.out.print(o);
            }
            System.err.println();
            space--;
        }
    }
}
