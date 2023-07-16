package Vipin;

import java.util.Scanner;
public class condisnol_statment {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.println("please enter a first number:");
        int a=num.nextInt();
        System.out.println("please enter b second number:");
        int b=num.nextInt();
        if(a>b)
        {
            System.out.println("There a="+ a +" is grater then b ");
        }

        else
        {
            System.out.println("There b="+b +" is grater then a ");
        }
    }
}
