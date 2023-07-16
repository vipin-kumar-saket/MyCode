/*
1234554321
1234*4321
123***321
12*****21
1*******1

*/

package Practice;

import java.util.Scanner;

public class ptrn03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            for(int s=1;s<i;s++){
                System.out.print("**");
            }
            for(int k=n-i;k>=1;k--)
            {

                System.out.print(k);
            }

            System.out.println();
        }


    }
}

