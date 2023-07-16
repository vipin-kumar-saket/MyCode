package leadcode;

import java.util.Scanner;

public class pelindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int temp=a;
        int rem=0,sum=0;
        while(a>0)
        {
            rem=a%10;

            sum=(sum*10)+rem;
            a=a/10;
        }
//        System.out.println(sum);
//        System.out.println(a);
        if(temp==sum)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
