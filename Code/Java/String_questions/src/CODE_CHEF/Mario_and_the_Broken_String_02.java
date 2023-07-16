package CODE_CHEF;

import java.util.Scanner;

public class Mario_and_the_Broken_String_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        String save1=input.substring(0,input.length()/2);
        String save2=input.substring(input.length()/2,input.length());



        if(save1.compareTo(save2) == 0){
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
