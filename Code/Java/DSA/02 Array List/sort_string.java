import java.util.ArrayList;
import java.util.Collections;

public class sort_string {
    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<>();
        s.add("My");
        s.add("name");
        s.add("is");
        s.add("vipin");
        System.out.println(s);
        Collections.sort(s);
        System.out.println("sorted string is ");
        Collections.sort(s,Collections.reverseOrder());
        System.out.println(s);
    }
}
