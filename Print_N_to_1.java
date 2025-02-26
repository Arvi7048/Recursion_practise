public class Print_N_to_1 {

    public static void printNum(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        System.out.println(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}

