package a_Basic_Problems;
import java.util.*;
public class FindFactorial {
     static int rFac(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n * rFac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the no to find factorial -> ");
        n = sc.nextInt();
        System.out.println("Factorial of "+n+" -> "+rFac(n));
    }
}
