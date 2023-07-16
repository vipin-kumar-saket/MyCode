package Vipin;

import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();
        if(age<25)
        {
            System.out.println("You are not experianced ");
        } else if (age<45) {
            System.out.println("You are semi experinced");

        }
        else {
            System.out.println("You are exprinced");
        }

    }
}
