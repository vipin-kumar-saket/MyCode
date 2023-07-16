package codechef_vipin;

import java.util.Scanner;

public class Vaccine_Dates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x>=y && x<=z)
            {
                System.out.println("Take second dose now");
            }
            else if (x<y  ) {
                System.out.println("Too Early");
            } else if (x>z) {
                System.out.println("Too Late");

            }
        }
    }
}
