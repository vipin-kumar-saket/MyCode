package Vipin;

import java.util.Scanner;
public class natural_do_while {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a= sc.nextInt();
        do{
            a--;
            System.out.println(a);
        }while (a>=1);

    }
}
