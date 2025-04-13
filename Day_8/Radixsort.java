import java.util.Scanner;

public class Radixsort {
    private static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");    
        System.out.println();
    }

    public static int max(int arr[]){
        int m = arr[0];
        for(int i : arr){
            if(m < i)
                m = i;
        }
        return m;
    }

    public static void countingSort(int arr[], int n, int mod){
        int out[] = new int[n];
        int count[] = new int[10];

        for(int i = 0;i < n ; i++)
            count[(arr[i] / mod) % 10]++;
        for(int i= 1;i < 10 ;i++)
            count[i] += count[i -1];

        for(int i = n-1; i >= 0; i--){
            out[count[(arr[i] /mod ) % 10] - 1] = arr[i];
            count[(arr[i] / mod) % 10]--;
        }
        for(int i = 0; i < n; i++)
            arr[i] = out[i];        
    }

    public static void radixSort(int arr[], int n){
        int max_num = max(arr);
        for(int i = 1; max_num/i > 0; i *= 10){
            countingSort(arr,n,i);
        }
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array : ");
        for(int i = 0; i < n; i++)
            arr[i] = inp.nextInt();
        
        radixSort(arr, arr.length);

        System.out.println("The Sorted Array : ");
        printArray(arr);
    }
}
