package codechef_vipin;

import java.util.Scanner;

public class Chef_and_Subarrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int n= sc.nextInt();
            int [] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int count=0;
            for(int  p=0;p<n;p++)
            {
                int sum=0,product=1;
                for(int q=p;q>=0;q--)
                {
                    product=arr[q]*product;
                    sum=sum+arr[q];
                    if(product==sum)
                    {
                        count++;
                    }
                }

            }
            System.out.println(count);


        }
    }
}
