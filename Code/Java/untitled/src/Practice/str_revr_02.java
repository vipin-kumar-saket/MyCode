package Practice;

import java.util.Scanner;
public class str_revr_02 {
    public static String info(String str){
        String nTemp="";
        for(int j=0;j<str.length();j++){
            nTemp=str.charAt(j)+nTemp;
        }
        System.out.println("this is info method :  "+nTemp);
        return nTemp;
    }
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
                if(ch==32 && input.charAt(i+1)!=32 ){

                    info(temp);
                    newString=newString+info(temp)+" ";
                    temp="";
                }
            }

        }

        System.out.println(newString+info(temp));
    }
}
