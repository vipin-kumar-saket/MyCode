package Pattern;

import java.util.Scanner;

public class n05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= sc.nextInt();
        int count=1;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(count+" ");
                count=count+1;

            }
            System.out.println(" ");
        }
    }
}
