package Vipin;

import java.util.Scanner;
public class FOOTCUP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            if(x==y || x!=0){
                System.out.println("YES");

        }
            else
            {
                System.out.println("NO");
            }
        }


    }
}
