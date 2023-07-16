package Vipin;

import java.util.Scanner;

public class Place_Value_Java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        long bv=sc.nextLong();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if((ch>='a'&&ch<='z') ){
                int value=ch-96;
                System.out.println(value);

            }
            if((ch>='A'&&ch<='Z')){
                int value=ch-64;
                System.out.println(value);

            }
        }
    }
}
