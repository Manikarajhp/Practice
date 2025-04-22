import java.util.Scanner;

public class LinearSearch {

    public static int Linear(int a[], int n, int t){
        for(int i = 0;i < n; i++){
            if(a[i] == t)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ar[] = new int[n];
        for(int i = 0;i < n ;i++)
            ar[i] = inp.nextInt();
        int t = inp.nextInt();
        int res = Linear(ar,n,t);
        System.out.println((res == -1) ? "Element not found.":"Element at : "+res);

    }
}