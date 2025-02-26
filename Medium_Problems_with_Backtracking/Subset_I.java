package Medium_Problems_with_Backtracking;
import java.util.*;
public class Subset_I {
    void printSubset(int[] arr, Vector<Integer> ans, int i,Vector<Vector<Integer>> allSubset){
        if(i == arr.length){
            allSubset.add(new Vector<>(ans));
                return;
            }

        ans.add(arr[i]);
        printSubset(arr,ans,i+1, allSubset);
        ans.remove(ans.size()-1);
        printSubset(arr,ans,i+1, allSubset);
        }




    public static void main(String[] args) {
                int[] arr = {1,2,3};
                Vector<Vector<Integer>> allSubset = new Vector<>();

                Vector<Integer> ans = new Vector<>();
                 Subset_I s = new Subset_I();
                s.printSubset(arr,ans,0,allSubset);
        System.out.println("All subsets:");

            System.out.println(allSubset);

    }
}
