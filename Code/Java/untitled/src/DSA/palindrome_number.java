package DSA;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=sc.nextInt();
        int rev=0,p=a;

            while (a<0){
            int rem=a%10;
            rev=(rev*10)+rem;

            a=a/10;
        }

        if(a==p){
            System.out.println("true");
        }
        else {
            System.out.println("no");
        }
    }
}
