package codechef_vipin;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            String s=sc.next();
            String t=sc.next();
            char []c=new char[5];
            for(int f=0;f<s.length();f++){
                if(s.charAt(f)==t.charAt(f)){
                    c[f]='G';
                }else{
                    c[f]='B';
                }
            }
            System.out.println(String.valueOf(c));
        }
    }
}
