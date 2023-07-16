package Pattern;

import java.util.Scanner;

public class n01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to print a pattern: ");
        int a= sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(a);
            }
            System.out.println(" ");
        }
    }
}
