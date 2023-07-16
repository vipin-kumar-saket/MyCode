package codechef_vipin;

import java.util.*;

public class Playing_with_Matches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] matches = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int a= sc.nextInt();
        for(int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x+y;
            int mSum = 0;
            while (sum > 0) {
                mSum += matches[sum%10];
                sum /= 10;
            }
            System.out.println(mSum);
        }
    }
}