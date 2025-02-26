package Easy_Problems;
import java.util.*;

public class BinarySearch {
    int rBinSear(int[] arr,int l,int r, int key){
        if(l <= r){
            int mid = (l+(r-l))/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                return rBinSear(arr,mid+1,r,key);
            }
            else{
                return rBinSear(arr,l,mid-1,key);
            }
                   }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        BinarySearch b = new BinarySearch();
        int result = b.rBinSear(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

    }
}
