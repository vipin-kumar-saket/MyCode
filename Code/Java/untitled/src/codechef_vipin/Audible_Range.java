package codechef_vipin;

import java.util.Scanner;

public class Audible_Range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++) {
            int x= sc.nextInt();
            if(x>=67&&x<=45000)
            {
                System.out.println("YES");
        }
            else
            {
                System.out.println("NO");
            }
        }
    }

    public static class Zero_Ones_Equal_One_Zeros {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int t= sc.nextInt();
            while(t-- >0)
            {

                int x = sc.nextInt();
                String s = "1",v = "0";
    //            String ;
                for(int i=0;i<x-2;i++)
                    s = s+"0";
                System.out.println(s+""+"1");
            }

            }
        }
}
