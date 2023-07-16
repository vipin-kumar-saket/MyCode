package compare_two_strings;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string:");
        String input1=sc.nextLine();
        System.out.println("Enter second string:");
        String input2=sc.nextLine();
        int len1,len2;
        len1=input1.length();
        len2=input2.length();

       char ch1[]=input1.toCharArray();
       char ch2[]=input2.toCharArray();
       int check=1;

       if(len1==len2)
       {
           for (int i=0;i<len1;i++)
           {
               if(ch1[i] != ch2[i]){
                   check--;
                   break;

               }
           }
       }
       else {
           check--;
       }
       if(check==1)
       {
           System.out.println("The two string are  EQUAL ");
           System.out.println(input1+" = "+input2);
       }
       else {
           System.out.println("The two string are NOT EQUAL!!!");
           System.out.println(input1+" != "+input2);
       }

    }
}
