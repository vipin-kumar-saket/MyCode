package DSA;

import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x/2;
        long mid;
        if(x==1){
            return 1;
        }
        while(low<=high){
            mid=(low +high)/2;
            long sqr=mid*mid;
            if(sqr==x)
            {
                return (int)mid;
            }
            if(sqr>x){
                high =mid-1;
            }
            else
                low=mid +1;
        }
        return (int )high;

    }
}
public class sqr_root {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        Solution s1= new Solution();
        System.out.print("The sqr root of "+ a+ " this is : ");
        System.out.println(s1.mySqrt(a));


    }
}
