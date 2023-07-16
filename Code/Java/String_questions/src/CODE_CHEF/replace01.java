package CODE_CHEF;

import java.util.Scanner;

public class replace01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++)
        {
            String input= sc.next();
            System.out.println(input.replace("party","pawri"));
        }
    }
}
