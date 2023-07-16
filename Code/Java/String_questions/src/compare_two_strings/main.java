package compare_two_strings;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first String :");
        String first=sc.nextLine();
        System.out.println("Enter a second String :");
        String second=sc.nextLine();
        if(first.equals(second))
        {
            System.out.println("The String is same");
        }
        else {
            System.out.println("The string is not same");
        }


    }
}
