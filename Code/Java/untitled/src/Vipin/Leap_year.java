package Vipin;

import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :");
        int year= sc.nextInt();
        if (year%4==0 && year%100!= 0|| year%400==0){
            System.out.println("The year is a leap year.");
        }
        else
            System.out.println("The year is a not leap year.");


    }
}
