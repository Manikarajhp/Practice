import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(i == j){
                    System.out.print(s.charAt(i));
                }
                else if((j == s.length()-i-1) && (j != i)){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
