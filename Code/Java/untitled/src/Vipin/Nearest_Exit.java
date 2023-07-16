package Vipin;

import java.util.Scanner;

public class Nearest_Exit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextByte();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextByte();
            if(x<=50)
            {
                System.out.println("LEFT");
            } else if (x>50&& x<=100) {
                System.out.println("Right");

            }
        }
    }
}
