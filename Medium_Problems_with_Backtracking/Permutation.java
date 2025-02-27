package Medium_Problems_with_Backtracking;
import java.util.*;
public class Permutation {

        public static void  getPer(List<Integer> arr, List<List<Integer>> result, int ind) {
            if (ind == arr.size()) {
                result.add(new ArrayList<>(arr)); // ✅ Add a copy to avoid reference issues
                return;
            }
            for (int i = ind; i < arr.size(); i++) {
                Collections.swap(arr, ind, i);
                getPer(arr, result, ind + 1);
                Collections.swap(arr, ind, i); // Backtrack
            }
        }

        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>(); // ✅ Use ArrayList instead of Vector
            List<Integer> arr = new ArrayList<>(Arrays.stream(nums).boxed().toList()); // ✅ Make it mutable
            getPer(arr, result, 0);
            return result;
        }



    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<>();
        int nums[] = {1,2,3};
       result =  permute(nums);
        System.out.println(result);



    }
}
