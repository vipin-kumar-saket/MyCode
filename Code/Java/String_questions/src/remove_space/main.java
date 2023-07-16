package remove_space;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String :");
        String ip=sc.nextLine();

        ip = ip.replaceAll("\\s+", "");

        System.out.print("Removed duplicates in the string is:");
        System.out.println(ip);

    }
}
