package last_occurrence_of_a_character;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        System.out.println("Enter a single character :");
        String ch=sc.next();
            int i,checkPosition=0;
        System.out.println("The length of string is :"+input.length());
        for( i=input.length()-1; i > 0 ;i--)
        {
            if(input.charAt(i) ==ch.charAt(0)){

                 checkPosition=i;
                break;
            }
        }
        System.out.println("The last occurrence of a character is :" +(input.length()-checkPosition) );
    }
}
