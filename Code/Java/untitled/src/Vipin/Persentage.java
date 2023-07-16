package Vipin;

import java.util.Scanner;
public class Persentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tha first number:");
        int a=sc.nextInt();
        System.out.println("Enter the first number : ");
        int b=sc.nextInt();
        System.out.println("Enter tha third number:");
        int c=sc.nextInt();
        System.out.println("Enter tha forth number:");
        int d=sc.nextInt();
        System.out.println("Enter the five th number:");
        int e=sc.nextInt();
        float per=(a+b+c+d+e)/5f;
        System.out.println("The percentage is :" +per);
    }
}
