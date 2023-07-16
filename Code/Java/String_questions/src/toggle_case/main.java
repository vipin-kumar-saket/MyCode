package toggle_case;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
         String result="";
        for (int i=0;i<input.length();i++)
        {
                char ch= input.charAt(i);
                if(ch>='a'&& ch<='z')
                {
                    result=(result+(char)(input.charAt(i)-32));
                }
                else if (ch>='A'&& ch<='Z') {
                    result=(result+(char)(input.charAt(i)+32));

                }
                else if (ch==32) {
                   result=result+ch;

                }


        }
        System.out.println(result);




        }


    }

