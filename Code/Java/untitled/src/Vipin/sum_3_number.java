package Vipin;

import java.util.Scanner;
public class sum_3_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a first number :");
        int a= sc.nextByte();
        System.out.print("Enter a second number :");
        int b= sc.nextByte();
        System.out.print("Enter a third  number :");
        int c= sc.nextByte();
        int sum=a+b+c;
        System.out.println("The sum of these value is: "+sum);
    }
}
