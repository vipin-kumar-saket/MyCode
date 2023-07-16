package codechef_vipin;

import java.util.Scanner;

public class Lucky_Four {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int  f;
        for(int i=0;i<a;i++)
        {
            int count=0;
            int x=sc.nextInt();
            while(x!=0)
            {
                f = x % 10;

                if(f==4){
                    count = count+1;

                }
                x=x/10;
            }
            System.out.println(count);
        }

    }
}
