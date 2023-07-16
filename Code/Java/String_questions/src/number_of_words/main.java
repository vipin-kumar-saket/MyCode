package number_of_words;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String input =sc.nextLine();


        int count=1;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch==32){
                count++;
            }
        }

        System.out.println("The total word in the string :" +count);
    }
}
