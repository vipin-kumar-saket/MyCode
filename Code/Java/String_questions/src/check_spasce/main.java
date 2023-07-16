package check_spasce;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string :");

        String  takeIp=sc.nextLine();               //Taking input form the user with line

        int count=0;

        for(int i=0;i<takeIp.length();i++)
        {
            char ch=takeIp.charAt(i);       // there are check the string all charters


            if(ch==32){
                count++;


            }

        }
        System.out.println("Total  number of spaces is:"+ count);

    }
}
