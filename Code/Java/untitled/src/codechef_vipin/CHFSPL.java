package codechef_vipin;

import java.util.*;

public class CHFSPL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextByte();
        for(int i=0;i<a;i++)
        {
            int b=3;
            int []arr=new int[b];
            for(int j=0;j<b;j++)
            {
                arr[j]=sc.nextInt();

            }
            Arrays.sort(arr);
            System.out.println(arr[1]+arr[2]);

        }
    }
}
