import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i < n;i++)
            arr[i] = inp.nextInt();

        for(int i = 0;i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("After sorting : ");
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}