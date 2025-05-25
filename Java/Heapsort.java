import java.util.Scanner;

public class Heapsort {
    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void heapsort(int arr[]){
        int len = arr.length;
        for(int i = len/2-1; i >= 0;i--){
            heapify(arr, len, i);
        }

        for(int i = len-1;i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int len, int i){
        int big = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < len && arr[left] > arr[big]){
            big = left;
        }

        if(right < len && arr[right] > arr[big]){
            big = right;
        }

        if(big != i){
            int temp = arr[i];
            arr[i] = arr[big];
            arr[big] = temp;

            heapify(arr, len, big);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = inp.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter Array elements : ");
        for(int i = 0;i < n;i++)
            arr[i] = inp.nextInt();


        System.out.print("The Array Befor sort : ");
        printArray(arr);
        
        heapsort(arr);


        System.out.print("The Array After sort : ");
        printArray(arr);
    }
}
