package Practice;
import java.util.Scanner;
public class pr03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a first number :");
        int a=sc.nextInt();
        System.out.println("Enter a second number :");
        int b= sc.nextInt();
        int notD=0;
        int sum=0;
        for(int i=0;i<=b;i++){
            if(i%a==0)
                sum+=i;
            else
                notD+=i;
        }
        if(sum>notD)
            System.out.println(sum-notD);
        if(sum<notD)
            System.out.println(notD-sum);
    }
}
