import java.util.Scanner;

public class Quicksort {
    private static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");    
        System.out.println();
    }
    
    public static void quictsort(int arr[], int l, int r){
        if(l < r){
            int p = divide(arr, l, r);
            quictsort(arr, l, p-1);
            quictsort(arr, p+1, r);
        }
    }
    public static int divide(int arr[], int l, int r){
        int i = l-1, j, p = arr[r];
        
        for(j = l; j < r; j++){
            if(arr[j] < p){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        
        return i+1;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array : ");
        for(int i = 0; i < n; i++)
            arr[i] = inp.nextInt();
        
        quictsort(arr, 0, arr.length-1);

        System.out.println("The Sorted Array : ");
        printArray(arr);
    }    
}