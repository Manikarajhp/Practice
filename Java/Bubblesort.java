import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i < n;i++)
            arr[i] = inp.nextInt();

        for(int i = 0;i < n-1;i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("After sort : ");
        for(int i:arr)
            System.out.print(i + " ");
    }
}