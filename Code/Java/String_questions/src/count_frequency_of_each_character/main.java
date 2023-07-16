package count_frequency_of_each_character;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int arr[]=new int [500];
        for(int i=0;i<input.length();i++)
        {
            int count=0;
            char ch=input.charAt(i);
            arr[i]=i;
//            count=arr[i]++;
//            System.out.println("The num is:"+ input.charAt(arr[i]));
            count=input.charAt(arr[i]++);

        }
        for(int i=-1;i<input.length();i++)
        {
            System.out.println("The value of the character : " + input.charAt(arr[i]) + " the number :" + arr[i]);
        }
    }
}
