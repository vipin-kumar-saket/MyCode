 package Vipin;

import java.util.Scanner;
import java.util.Arrays;

public class Problems_in_your_to_do_list{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int n = sc.nextInt();

            int [] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            for(int x=0;x<arr.length;x++)
            {
                // System.out.println(arr[x]);

                if((arr[x])>=1000)
                {
                    count++;
                }

            }
            System.out.println(count);

        }

    }
}
