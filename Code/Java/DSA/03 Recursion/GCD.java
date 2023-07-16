import java.util.Scanner;

public class GCD {
    static  int EuclidGCD(int x,int y){
        if(y==0){
            return x;
        }
        return EuclidGCD(y,x%y);
    }
    static int gcd(int x,int y){
        while(x%y !=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter first number ");
        int x=sc.nextInt();
         System.out.println("Enter Second number ");
        int y=sc.nextInt();
        System.out.println( "The GCD is :"+gcd(x,y));
        System.out.println( "The EuclidGCD is :"+EuclidGCD(x,y));


    }
}
