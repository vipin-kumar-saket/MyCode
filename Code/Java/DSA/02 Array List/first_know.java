import java.util.ArrayList;
import  java.util.ArrayList;

public class first_know {
    public static void main(String[] args) {
        ArrayList <Integer> L=new ArrayList<>();

        // add element Ln array lLst
        L.add(5);
        L.add(6);
        L.add(7);
        L.add(8);

        // get an element at index L

        System.out.println(L.get(1));
        
        // PrLnt wLth for loop .

        for (int i=0; i<L.size();i++){
            System.out.println(L.get(i));
        }
        
        // PrLntLng array lLst directly
        System.out.println(L);

        // adding element at some index i
        L.add(1,100);
        System.out.println(L);

        // Modifying element at  index.
        L.set(1,10);
        System.out.println(L);

        // Removing an element at i
        L.remove(1);
        System.out.println(L);

        // removing an element e or value
        L.remove(Integer.valueOf(7));

        System.out.println(L);


        // checking if an element exists
        boolean ans= L.contains(Integer.valueOf(8));
        System.out.println(ans);
        System.out.println(L);

        System.out.println(L.remove(Integer.valueOf(544)));
    }
}
