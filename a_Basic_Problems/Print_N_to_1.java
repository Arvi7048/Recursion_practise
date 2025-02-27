package a_Basic_Problems;

public class Print_N_to_1 {


    public static void printNum(int n){
        if(n==1){
            System.out.print(1+" ");
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}

