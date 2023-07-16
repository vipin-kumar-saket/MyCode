import java.util.Scanner;

public class R01_n_Number {

    static  void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    static void  printN_Number(int n){

        if(n==1){
            System.out.println(1);
            return;
        }
        printN_Number(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
//        printN_Number(n);
        printDec(n);
    }
}
