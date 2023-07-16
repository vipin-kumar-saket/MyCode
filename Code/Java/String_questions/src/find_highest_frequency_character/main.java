package find_highest_frequency_character;

import javax.swing.*;
import java.util.*;

public class main {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input=sc.nextLine();

        int countArray[]= new int[500];

        for(int i=0;i<input.length();i++){

            countArray[input.charAt(i)]++;
        }

        for(int i=0;i<input.length();i++)
        {
            char ch= input.charAt(i); // 115
            int count=0;
            for(int j=0;j<=i;j++) {
                char ch_j = input.charAt(j);
            }
        }
        for(int i=0;i<input.length();i++)
        {
            System.out.println("the oc. "+ countArray[input.charAt(i)]);
        }

    }
}
