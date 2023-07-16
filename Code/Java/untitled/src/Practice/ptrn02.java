package Practice;

import java.util.Scanner;

public class ptrn02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int i= 1;
        for( i =1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int p=i-1;p>=1;p--){
                System.out.print(p);
            }
            System.out.println();
   }


}

}
