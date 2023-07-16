package Vipin;

import java.util.Scanner;
public class  kilometer_miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in kilometer:");
        float a= sc.nextFloat();
        System.out.println("The value is miles in: "+a/1.60934+"");


    }
}
