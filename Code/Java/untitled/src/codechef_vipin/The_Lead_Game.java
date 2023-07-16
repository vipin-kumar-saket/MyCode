package codechef_vipin;

import java.util.Scanner;

public class The_Lead_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int max=0,win=2, num1 =0 ,num2=0;
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            num1 = a+num1;
            num2 = b+num2;
            if(num1>num2){
                if((num1-num2) > max){
                    win = 1;
                    max = num1-num2;
                }
            }else{
                if((num2-num1) > max){
                    win = 2;
                    max = num2-num1;
                }
            }
        }
        System.out.println(win+" "+max);

    }
}
