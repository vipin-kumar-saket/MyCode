package Array_list_in_java;

import java.util.ArrayList;
import java.util.Collections;

import static Array_list_in_java.rev.reverseList;

class rev{
    public static void reverseList(ArrayList<Integer> list){
        int i=0,j= list.size()-1;
        while(i<j){
            /*
            int temp=a;
            a=b;
            b=temp;
             */
            Integer temp= Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }
}

public class revarce_arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.add(0);
        list.add(12);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List is :"+ list);
//        reverseList(list);
        Collections.reverse(list);                            // Here we use pre-defined method .
        System.out.println("reversed list is " +list);
        Collections.sort(list);
        System.out.println("Ascending order list is " +list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("descending order list is " +list);



    }
}
