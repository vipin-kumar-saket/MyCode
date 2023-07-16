package codechef_vipin;

import java.util.Scanner;

public class Ranklist_Pages {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        while (a<=0)
        {
            int x= sc.nextInt();
            if(x%25==0)
            {
                System.out.println(x/25);
            }
            else {
                System.out.println((x/25)+1);
            }

        }
    }
}
