package Vipin;

import java.util.Scanner;

public class kunn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int even=0,odd=0;

        int [] arr=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();

                if(arr[j]%2==0)
                {
                    even++;
                }
                else {
                    odd++;
                }
        }
        System.out.println("The even number in tha given array: "+even);
        System.out.println("The odd number in tha given array : "+odd);


    }
}
