package reverse_of_string;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        String op="";

        for(int i=0;i<input.length();i++)
        {
            op=input.charAt(i)+op;
        }
        System.out.println(op);
    }
}
