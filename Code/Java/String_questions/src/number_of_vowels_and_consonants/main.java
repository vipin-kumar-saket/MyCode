package number_of_vowels_and_consonants;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        int vowels=0,consonants=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'  ||   ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U')
            {
                vowels++;

            }
            else if (ch==32) {

            }
            else {
                consonants++;
            }

        }
        System.out.println("The vowels are :" +vowels);
        System.out.println("The consonants are :"+ consonants);
    }
}
