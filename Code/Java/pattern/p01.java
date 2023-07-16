import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        byte input= sc.nextByte();
        int num=1;
        for (int i=0;i<input;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(num%2==0){
                    System.out.print(" 1");
                }
                else{
                System.out.print(" 0");}
                num++;
            }
            System.out.println();
        }
    }
}
