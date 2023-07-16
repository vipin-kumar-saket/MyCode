package lowercase_to_uppercase;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a lowercase string :");
        String input=sc.nextLine();
        System.out.println(input.toUpperCase());
    }
}
