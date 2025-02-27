package c_Medium_Problems_with_Backtracking;
import java.util.*;

public class String_Permutation {

    public static void getPer(char[] arr, List<String> result, int ind) {
        if (ind == arr.length) {
            result.add(new String(arr)); // ✅ Add a copy of the current permutation
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            swap(arr, ind, i);
            getPer(arr, result, ind + 1);
            swap(arr, ind, i); // Backtrack
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>(); // ✅ Use ArrayList instead of Vector
        char[] arr = str.toCharArray(); // ✅ Convert string to char array
        getPer(arr, result, 0);
        return result;
    }

    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = permute(str);
        System.out.println(result);
    }
}
