package Vipin;

import java.util.Scanner;

public class con4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%2==0 && y%2==0)
            {
                if(x>1 && y>1)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }

            }
            else {
                System.out.println("No");
            }

        }

    }
}
