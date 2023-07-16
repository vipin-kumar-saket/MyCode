package Remove_duplicates;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String :");
        String ip=sc.nextLine();
        String result="";

        for(int i= 0; i< ip.length();i++)
        {
            char ch=ip.charAt(i);
            if(result.indexOf(ch)<0)
            {
                result += ch;
            }
        }

        System.out.print("Removed duplicates in the string is:");
        System.out.println(result);
    }
}
