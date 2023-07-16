import java.util.Scanner;

public class CountOfDigit {
    static int sum(int n){

      if(n/10==0) return 1;
      return sum(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println(sum(n));

    }
}
