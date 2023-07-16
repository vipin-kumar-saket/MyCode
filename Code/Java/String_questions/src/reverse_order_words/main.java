package reverse_order_words;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        String newString="";

        int  count=0;

        // this code for count the number of spaces

        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==32){
                count++;
            }
        }
        //this code for reverse the words
        char temp='\0';
        for(int i=0;i!=input.charAt('\0');i++)
        {
            int j;
            for(j=input.length()-1;j>=0;j--)
            {
                count--;
                newString= input.charAt(j)+newString;

            }
            i=temp;
            newString=(input.charAt(i)) + newString;
        }
        System.out.println(newString);
    }
}
