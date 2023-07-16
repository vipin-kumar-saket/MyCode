import java.util.Scanner;

public class factorial {
    static int fact(int n){
        // Base case
       if(n==0)
           return 1;

       // Smaller problem - recursive work
       int smaller = fact(n-1); // factorial (4) = 24

        // big problem or self work
       return n*smaller;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
