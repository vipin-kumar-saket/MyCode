package String_pratic;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class angram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ","");

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a,b));

    }
}



 