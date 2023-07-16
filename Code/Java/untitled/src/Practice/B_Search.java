package Practice;

import java.util.Scanner;

public class B_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number for you want to create an array :");
        int input=sc.nextInt();

        int []arr = new int[input];
        for(int i=0;i<input;i++)
        {
             arr[i]=sc.nextInt();
        }
        

    }
}
