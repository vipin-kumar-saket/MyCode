import java.util.Scanner;

public class k_Multiples {
    static void multi(int n, int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multi(n, k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Enter a power value ");
        int k=sc.nextInt();
        multi(n,k);

    }
}
