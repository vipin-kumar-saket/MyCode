// This code written for the reverse of the word in string
package String_pratice;


import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Pr01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String input="  my name is   vipin";
        String nString ="";
        String temp ="";
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)!=32){
                temp=input.charAt(i)+temp;
            }
            else if (input.charAt(i)==32 && input.charAt(i+1)!=32) {
                nString=nString+temp+" ";
                temp="";

            }
        }
        nString=nString+temp;
        System.out.println(nString);
    }
}
