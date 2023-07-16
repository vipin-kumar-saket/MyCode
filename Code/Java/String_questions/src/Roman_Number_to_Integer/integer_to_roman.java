package Roman_Number_to_Integer;
import java.util.*;

public class integer_to_roman {
    public static void romanToInt(int num){
        Map<Integer ,Character> map= new HashMap<>();
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');
//        String s= map.
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        System.out.println("The roman number is :");

    }
}
