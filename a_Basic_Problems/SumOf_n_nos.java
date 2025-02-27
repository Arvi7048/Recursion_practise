package a_Basic_Problems;
import java.util.*;
public class SumOf_n_nos {
     int rSum(int n){
        if(n<1){
            return 0;
        }
        return n+rSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to find of n elements-> ");
        int n = sc.nextInt();
        SumOf_n_nos rs = new SumOf_n_nos();
        System.out.println("sum of "+n+"-> "+rs.rSum(n));
    }
}
