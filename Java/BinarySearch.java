import java.util.Scanner;

public class BinarySearch {
    public static int binary(int []a, int t){
        int s = 0, e = a.length;
        while(s < e){
            int mid = (s+e) / 2;
            if(a[mid] == t)
                return mid;
            else if(a[mid] > t)
                e = mid;
            else
                s = mid+1;
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
        int res = binary(ar,t);
        System.out.println((res == -1) ? "Element not found."+res : "Element at index : "+res);
    }   
}
