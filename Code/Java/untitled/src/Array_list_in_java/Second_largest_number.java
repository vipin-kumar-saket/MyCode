package Array_list_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Second_largest_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);


        ArrayList <Integer> arrList= new ArrayList<Integer>();
        System.out.println("Enter a number of element :");
        int n=sc.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arrList.add(num);
        }
        Collections.sort(arrList);

        System.out.println("The sorted array is :");

        for(int i=0;i<arrList.size();i++){
            System.out.print(arrList.get(i)+" ");
        }
        System.out.println();
        int secondLargest=arrList.get(n-2);
        System.out.println("The second largest number is a :" +secondLargest);
    }
}
