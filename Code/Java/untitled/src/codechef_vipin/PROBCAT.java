package codechef_vipin;

import java.util.Scanner;

public class PROBCAT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        while (a>0)
        {
            int x=sc.nextInt();
            if(x<100&& x>0)
            {
                System.out.println("Easy");
            }
            else if(x>=100&& x<200)
            {
                System.out.println("Medium");
            }
            else if(x>=200&& x<=300)
            {
                System.out.println("Hard");
            }
        }
    }
}
