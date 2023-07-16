package first_occurrence_of_a_character;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string :");
        String input = sc.nextLine();
        System.out.print("Enter search the character: ");
        String ch=sc.next();
        int i,p=0;
        for( i=0;i<input.length();i++)
        {
            if(ch.charAt(0)==input.charAt(i)){
                p=i;
                break;
            }
        }
        System.out.println(p);
    }
}
