 package Vipin;

import java.util.Scanner;

public class Adjacent_Sum_Parity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++)
        {
            int b= sc.nextInt();
            int p=0;
            int [] arr= new int[b];
            for(int j=0;j<b;j++)
            {
                arr[j]=sc.nextInt();



                p=p+arr[j];


            }
            if(p%2==0){
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}
