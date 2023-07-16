package reverse_order_words;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input="      my name is      vipin";
        String nstr="";
        String temp="";

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=32){
                temp= temp+input.charAt(i);

            }
            else if (input.charAt(i)==32  && input.charAt(i+1)!=32) {
                nstr= temp+" "+nstr ;
                temp="";
            }
        }
        nstr= temp+" "+nstr;
        System.out.println(nstr);

    }
}
