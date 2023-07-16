package codechef_vipin;

import java.util.*;

public class Devu_and_friendship_testing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int [] arr=new int[a];
//        int p=a;
        for( int i=0;i<a;i++)
        {
            arr[i]= sc.nextInt();

        }
//        Arrays.sort(arr);
        int s=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                s++;
            }
        }
        System.out.println(s);



    }
}
