package Vipin;

import java.util.Scanner;
public class present_element_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= { 500,928,96,45,36,78,5};
        System.out.println("Enter a integer: ");
        int a=sc.nextInt();
        for(int i=0;i<arr[i];i++)
        {
            if(arr[i]==a)
            {
                System.out.println("YES");
                break;
            }
            else
            {
                System.out.println("NO");
                break;
            }
        }


    }
}
