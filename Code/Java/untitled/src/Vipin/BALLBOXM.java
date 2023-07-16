package Vipin;
import java.util.Scanner;

public class BALLBOXM
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        for (int i=0; i<a; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            int cnt=0;

            for (int j=0; j<n; j++) {
                char ch = str.charAt(j);

                if (cnt > 3) {
                    break;
                }
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    cnt = 0;
                }
                else {
                    cnt++;
                }
            }

            if (cnt > 3) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
