import java.util.*;
public class Oddsum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sum = 0;
        for(int i = 1; i<= n;i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
}