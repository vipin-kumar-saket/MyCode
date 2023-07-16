package codechef_vipin;

import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count=0,count1=0;

        int[] arr = new int[n];
        for (int j = 0; j < n; j++)
        {
            arr[j] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if (arr[i]%2==0)
            {
                count++;
            }
            else
            {
                count1++;
            }
        }



        if(count>count1)
        {
            System.out.println("READY FOR BATTLE");
        }
        else
        {
            System.out.println("NOT READY");
        }
    }
}
