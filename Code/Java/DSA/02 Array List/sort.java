import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(12);
        list.add(2);
        list.add(5);
        list.add(56);
        System.out.println(list.indexOf(2));
        System.out.println("Main list is ");
        System.out.println(list);
        System.out.println("Sorting in ascending order ");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Sorting in descending order ");
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}
