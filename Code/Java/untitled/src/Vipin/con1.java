package Vipin;

//import java.util.Arrays;
import java.util.Scanner;

public class con1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
                int n = sc.nextInt();

                int [] arr=new int[n];
                for(int j=0;j<n;j++)
                {
                    arr[j]=sc.nextInt();
            }
             int prodeuct=1;
            int count=0;
//            Arrays.sort(arr);
            for(int y=0;y<arr.length;y++)
            {
                // System.out.println(arr[x]);

                if((arr[y])<=0)
                {
                    count++;
                }

            }
            for(int x=0;x<arr.length;x++)
            {
                prodeuct=prodeuct*arr[x];

            }
//            System.out.println(prodeuct);
            if(prodeuct>=0)
            {
                System.out.println("0");
            } else if (count%2==0) {
                System.out.println("0");

            }
            else {
                System.out.println("1");
            }
        }
    }
}
