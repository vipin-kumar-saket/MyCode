package remove_all_extra_blank_spaces;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string : ");
        String input=sc.nextLine();
        String nString ="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=32  || (input.charAt(i)==32&& input.charAt(i+1)!=32)){
                nString=nString+input.charAt(i);

            }
        }
        System.out.println(nString);
    }
}
