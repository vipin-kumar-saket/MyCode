package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class pr_list01 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(11);
        l1.add(12);
        l1.add(5);
        l1.add(14);
        l1.add(15);
        System.out.println(l1);
        Collections.sort(l1);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
