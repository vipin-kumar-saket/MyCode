package Array_list_in_java;
import  java.util.*;

public class vip {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int fact = 1;
        String s="";
        for (int i = 1; i <= 3; i++) {
            fact *= i;
            num.add(i);
            s=s+i;

        }
        System.out.println(s);
    }
}
