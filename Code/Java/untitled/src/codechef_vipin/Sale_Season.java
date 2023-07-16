package codechef_vipin;

import java.util.Scanner;

public class Sale_Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
          if(b<=100)
          {
              System.out.println(b);
          }
          else if(b>100&&b<=1000)
          {
              System.out.println(b-25);
          } else if (b>1000&& b<=5000) {
              System.out.println(b-100);

          }
          else if(b>5000) {
              System.out.println(b-500);

          }

        }
    }
}
