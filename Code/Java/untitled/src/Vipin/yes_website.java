package Vipin;

import java.util.Scanner;
public class yes_website {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter website url:");
        String website=sc.next();
        if(website.endsWith(".com")||website.endsWith(".COM"))
        {
            System.out.println("This Website belong to the Commercial. ");
        }
       else if(website.endsWith(".org")||website.endsWith(".ORG"))
        {
            System.out.println("This Website belong to the Organization. ");
        }
         else if(website.endsWith(".in") ||website.endsWith(".IN"))
        {
            System.out.println("This Website belong to the Indian website.");
        }
         else
        {
            System.out.println("OOPS !  Wrong url");
        }


    }
}
