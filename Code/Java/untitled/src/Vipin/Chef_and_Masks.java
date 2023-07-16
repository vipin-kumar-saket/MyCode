package Vipin;

import java.util.Scanner;
public class Chef_and_Masks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();

            if((x*100)>=(y*10))
            {
                System.out.println("Cloth");
            }
            else {
                System.out.println("Disposable");
            }
        }

    }
}
