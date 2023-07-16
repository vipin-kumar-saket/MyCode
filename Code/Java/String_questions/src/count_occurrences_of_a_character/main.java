package count_occurrences_of_a_character;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input=sc.nextLine();

        int countArray[]= new int[200];

        for(int i=0;i<input.length();i++){
            countArray[input.charAt(i)]++;

        }



        for(int i=0;i<input.length();i++)
        {

            char ch= input.charAt(i);
            int count=0;
            for(int j=0;j<=i;j++) {
                char ch_j = input.charAt(j);
                if (ch == ch_j) {
                    count++;
                }
            }
                if (count == 1)

                    System.out.println("The occurrence of " + input.charAt(i) + " is: " + countArray[input.charAt(i)]);

        }
    }
}
