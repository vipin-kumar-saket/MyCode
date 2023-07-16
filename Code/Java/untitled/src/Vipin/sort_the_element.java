package Vipin;

import java.util.Arrays;
import java.util.Scanner;

public class sort_the_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number you want to sort in array:");
        int n = sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter a element you want to sort in array:");
        for(int p=0;p<n;p++)
        {
            arr[p]= sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("The sorted element is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Thank you , Your element is sorted.");
    }
}
