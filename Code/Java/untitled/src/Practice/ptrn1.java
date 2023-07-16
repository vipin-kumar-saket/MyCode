package Practice;

import java.util.Scanner;

public class ptrn1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(j);

            }
            System.out.println();
            for(int p=0;p<i;p++){
                System.out.print(" ");
            }

        }
    }
}
