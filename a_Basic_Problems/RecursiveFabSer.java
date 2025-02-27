package a_Basic_Problems;
import java.util.*;
public class RecursiveFabSer {
    int rFib(int n){
        if(n==0 || n==1){
             return n;
        }
        return rFib(n-1)+rFib(n-2);

    }
    public static void main(String[] args) {
        RecursiveFabSer r = new RecursiveFabSer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to print fibanacci series-> ");
        int n = sc.nextInt();
        for(int i = 0;i<n; i++){
            System.out.print(r.rFib(i)+" ");
        }
    }
}
