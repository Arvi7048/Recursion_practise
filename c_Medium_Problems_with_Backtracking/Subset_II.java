package c_Medium_Problems_with_Backtracking;
import java.util.*;

public class Subset_II {
    void printSubset2(int[] arr, Vector<Integer> ans, int i,Vector<Vector<Integer>> allSubset,int n){
        if(i == n){
            allSubset.add(new Vector<>(ans));
            return;
        }

        ans.add(arr[i]);
        printSubset2(arr,ans,i+1, allSubset,n);
        ans.remove(ans.size()-1);
       int ind = i+1;
        while(ind<n && arr[ind] == arr[ind-1]){
            ind++;
        }
        printSubset2(arr,ans,ind, allSubset,n);
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2,1,2,4,3};
        Arrays.sort(arr1);
        Vector<Vector<Integer>> allSubset = new Vector<>();
        int n = arr1.length;
        Vector<Integer> ans = new Vector<>();
        Subset_II s = new Subset_II();
        s.printSubset2(arr1,ans,0,allSubset,n);
        System.out.println("All subsets:");

        System.out.println(allSubset);
    }
}
