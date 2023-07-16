package CODE_CHEF;

import java.util.Scanner;

public class The_Block_Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0, temp=n;


        for(int i=0;i<n;i++)
        {
            int input= sc.nextInt();
            for(int j=0;j<input;j++)
            {
              sum=  (sum*10)+input/10;
              input=input/10;
            }
        }
        if(sum==temp){
            System.out.println("wins");
        }
        else
        {
            System.out.println("loses");
        }
    }
}
