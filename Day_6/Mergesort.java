import java.util.Scanner;

public class Mergesort {

    public static void printArray(int a[]){
        for(int i:a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void mergesort(int arr[], int l, int r){
        if(l < r){
            int mid = (l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int arr[], int l, int mid, int r){

        int n1 = mid-l+1;
        int n2 = r-mid;
        int Larr[] = new int[n1];
        int Rarr[] = new int[n2];

        for(int x=0;x<n1;x++){
            Larr[x] = arr[l+x];
        }
        for(int x=0;x<n2;x++){
            Rarr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i<n1 && j<n2) {
            if(Larr[i] <= Rarr[j]){
                arr[k] = Larr[i];
                i++;
            }
            else{
                arr[k] = Rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = Larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = Rarr[j];
            j++;
            k++;
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
        
        mergesort(arr, 0, arr.length-1);


        System.out.print("The Array After sort : ");
        printArray(arr);
    }
}
