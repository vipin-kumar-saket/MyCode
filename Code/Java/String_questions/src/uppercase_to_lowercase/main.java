package uppercase_to_lowercase;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Uppercase String :");
        String input=sc.nextLine();
        System.out.println(input.toLowerCase());
    }
}
