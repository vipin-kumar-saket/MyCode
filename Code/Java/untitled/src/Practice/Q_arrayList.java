package Practice;
import java.util.*;
public class Q_arrayList {
    public static void main(String[] args) {
            ArrayList<Integer> L1= new ArrayList<>();
            L1.add(90);
            L1.add(40);
            L1.add(30);
            L1.add(50);
            int newA[]={};
        System.out.println(L1);
                                                        // how to get element in array list
        int element= L1.get(3);
        System.out.println(element);

//                                                      how to add element in between the array list
        L1.add(3,40);
        System.out.println(L1);

                                                        // how to set element in the array list OR replace
        L1.set(0,25);
        System.out.println(L1);
                                                        // How to remove or delete  element in the array list
        L1.remove(0);
        System.out.println(L1);
                                                        // How to find size of array list.
        int s=L1.size();
        System.out.println("The size of Array list is : "+ s);
                                                        // How to print element using loop
        for(int i=0;i<L1.size();i++){
            System.out.print(L1.get(i));
        }
        System.out.println();

                                        // sort the list
        Collections.sort(L1);
        System.out.println(L1);

    }
}
