import java.util.Scanner;

public class lcm {
    static  int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y, x%y);
    }
    static int NumLCM(int x,int y){
        return (x*y)/gcd(x,y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter first number ");
        int x=sc.nextInt();
        System.out.println("Enter Second number ");
        int y=sc.nextInt();
        System.out.println("LCM is a : "+ NumLCM(x,y));
    }
}
