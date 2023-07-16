package Vipin;

import java.util.Scanner;

public class Q001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=100;
        int nag_sum=0,p_ev__sum=0, p_add_sum=0;
       for(int i=0;i<a;i++)
       {
           int n=sc.nextInt();
           if(n>0 && n%2==0)
           {
               p_ev__sum=p_ev__sum+n;
           }
           else if (n<0)
           {
               nag_sum=nag_sum+n;
           }
           else if (n>0 && n%2==1)
           {
               p_add_sum=p_add_sum+n;
           }
           else break;
       }
        System.out.println("The nagetive  sum number is : " +nag_sum);
        System.out.println("The Possitive even sum number is : " +p_ev__sum);
        System.out.println("The Possitive odd sum number is : " +p_add_sum);


    }
}
