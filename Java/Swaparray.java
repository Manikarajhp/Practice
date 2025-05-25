import java.util.Arrays;
import java.util.Scanner;

public class Swaparray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A size : ");
        int n = inp.nextInt();
        System.out.print("Enter B size : ");
        int m = inp.nextInt();
        int arrayA[] = new int[(m > n) ? m:n];
        int arrayB[] = new int[(m > n) ? m:n];
        System.out.print("Enter Array A : ");
        for(int i = 0;i < n;i++)
            arrayA[i] = inp.nextInt();
        System.out.print("Enter Array B : ");
        for(int i = 0;i < m;i++)
            arrayB[i] = inp.nextInt();

        int temp[] = arrayA;
        arrayA = arrayB;
        arrayB = temp;

        System.out.print("Array A : ");
        for(int i = 0;i < m;i++)
            System.out.print(arrayA[i] + " ");
        System.out.print("\nArray B : ");
        for(int i = 0;i < n;i++)
            System.out.print(arrayB[i] + " ");

    }
}
