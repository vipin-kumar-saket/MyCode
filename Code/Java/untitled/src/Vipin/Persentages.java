package Vipin;

import java.util.Scanner;
public class Persentages {
    public static void main(String[] args) {
        System.out.println("Welcome to CBSE total marks :");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Physics number :");
        int a= input.nextInt();
        System.out.println("Enter Chemistry number :");
        int b= input.nextInt();
        System.out.println("Enter Math number :");
        int c= input.nextInt();
        System.out.println("Enter Hindi number :");
        int d= input.nextInt();
        System.out.println("Enter English number :");
        int e= input.nextInt();
        float total=(a+b+c+d+e)/5f;
        System.out.println("Your persentage is : "+total);
    }
}
