package codechef_vipin;

import java.util.Scanner;

public class Recent_contest_problems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s1="START38";
        String s2="LTIME108";

        int t= sc.nextInt();
        int count1=0,count2=0;
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            while (x-- >0)
            {
                String  s= sc.next();
                if(s1.equals(s))
                {
                    count1++;

                }
                else
                {
                    count2++;
                }
            }
            System.out.println(count1+" "+count2);


        }
    }
}
