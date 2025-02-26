package Easy_Problems;
import java.util.*;
public class CheckArraySorted {
    boolean isSorted(int arr[], int n){
        if(n==0 || n==1){
            return true;
        }
        return (arr[n-1] >= arr[n-2]) && isSorted(arr,n-1);
    }
    public static void main(String[] args) {
        CheckArraySorted a = new CheckArraySorted();
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter total no of elements of array-> ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " +n+ " elements of array -> ");
        for(int i = 0; i<n; i++){

            arr[i] = sc.nextInt();
        }
        if(a.isSorted(arr,n)){
            System.out.println("array is sorted");

        }
        else{
            System.out.println("not sorted");
        }


    }
}
