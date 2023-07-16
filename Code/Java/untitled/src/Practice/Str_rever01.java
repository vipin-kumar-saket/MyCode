package Practice;

import java.util.Scanner;

public class Str_rever01 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string :");
        String input=sc.nextLine();
        String newString="";
        String temp="";

        for(int i=input.length()-1;i>=0;i--){
            char ch=input.charAt(i);

            if(ch!=32)
            {
                temp=temp+ch;
            }
            else {
                if(ch==32&& input.charAt(i+1)!=32){

                String nTemp="";
                for(int j=0;j<temp.length();j++){
                    nTemp=temp.charAt(j)+nTemp;
                }
                newString=newString+nTemp+" ";
                temp="";
            }
            }

        }
        System.out.println(newString+temp);
    }
}
/*
for(int i=0;
 */
