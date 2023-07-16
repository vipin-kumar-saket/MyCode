import java.util.Scanner;

public class sumOfDigit {
    static int dSum(int n){
        if(n>=0 && n<=9) return n;
        return dSum(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println(dSum(n));
    }
}
