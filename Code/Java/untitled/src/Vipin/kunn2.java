package Vipin;

import java.util.Scanner;
import java.util.Arrays;

public class kunn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
//        int even=0,odd=0;

        int [] arr=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();

           Arrays.sort(arr);

        }
    }
}
