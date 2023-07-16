/*
This is code written O(n) time complexity

* */
package Practice;

import java.util.Scanner;

public class res_str01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input= sc.nextLine();
        String nStr="";
        String temp="";
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)!=32 ){
                temp=input.charAt(i)+temp;
            }
            if(input.charAt(i)==32 && input.charAt(i+1)!=32){
                nStr=nStr+temp+" ";
                temp="";
            }
        }
        nStr=nStr+temp;
        System.out.println(nStr);
    }
}
