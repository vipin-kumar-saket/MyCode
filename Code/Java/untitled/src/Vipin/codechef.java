package Vipin;

import java.util.Scanner;
import java.util.Arrays;

public class codechef {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);
            for (int i = 0; i < n; i = i + 2) {
                if (i == n - 1) {
                    System.out.println(ar[i]);
                    break;
                }

                if (ar[i] != ar[i + 1]) {

                    System.out.println(ar[i]);
                    break;
                }

            }
            t--;
        }
    }
}
