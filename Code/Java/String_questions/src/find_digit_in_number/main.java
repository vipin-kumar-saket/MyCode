package find_digit_in_number;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        String nStr="";
        String sStr="";
        String psStr="1";
        for(int i=0;i<input.length();i++){

            if(input.charAt(i)=='0'||input.charAt(i)=='1'||input.charAt(i)=='2'||input.charAt(i)=='3'||input.charAt(i)=='4'||input.charAt(i)=='5'||input.charAt(i)=='6'||input.charAt(i)=='7'||input.charAt(i)=='8' ||input.charAt(i)=='9'){
                nStr=nStr+input.charAt(i);
            }
            else sStr=sStr+input.charAt(i);
        }
        System.out.println("Total new number generated is :"+nStr);
        System.out.println("The length of string is :"+nStr.length());
        System.out.println("Total word are :"+sStr);
        System.out.println("Total length of word are :"+sStr.length());

    }
}
