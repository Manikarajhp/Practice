import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int space = n/2, i;
        for( i = 1;i <= n;i+=2){
            for(int j = 0;j < space;j++)
                System.out.print(" ");
            for(int k = 1; k <= i;k++)
                System.out.print(k);
            System.out.println();
            space--;
        }
        space = 0;
        for(int o = i-4;o >= 1;o-=2){
            space++;
            for(int j = 0;j < space;j++)
                System.out.print(" ");
            for(int k = 1;k <= o;k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
