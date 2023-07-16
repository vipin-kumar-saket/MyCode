package Vipin;

import java.util.Scanner;

public class col3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextByte();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int []arr=new int[b];
            for(int j=0;j<b;j++)
            {
                arr[j]=sc.nextInt();
            }

        }
    }
}
