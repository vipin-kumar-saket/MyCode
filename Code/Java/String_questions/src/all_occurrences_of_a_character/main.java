package all_occurrences_of_a_character;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string :");
        String input =sc.nextLine();
        System.out.print("Enter a single character : ");
        String checkChar=sc.nextLine();
        int count=0;

        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            if (ch==checkChar.charAt(0)){
                count++;
            }
        }
        System.out.println("The total number of " +checkChar +" is :" +count);
    }
}
