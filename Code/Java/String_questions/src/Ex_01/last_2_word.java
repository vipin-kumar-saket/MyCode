package Ex_01;

import java.util.Scanner;

public class last_2_word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        for (int i=input.length()-3;i<input.length();i++)
        {

            System.out.print(input.charAt(i));

        }


    }
}
