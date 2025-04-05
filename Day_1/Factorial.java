import java.io.*;
import java.util.*;
class Factorial {
    public static void main(String[] args) {
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
        System.out.println(fact);
    }   
}
