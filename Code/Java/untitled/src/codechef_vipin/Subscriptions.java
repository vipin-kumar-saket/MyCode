package codechef_vipin;

import java.util.Scanner;

public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%6==0){
                System.out.println(((x/6)+1)*y);
            }
            else {
                System.out.println((x/6)*y);
            }


        }

    }
}
