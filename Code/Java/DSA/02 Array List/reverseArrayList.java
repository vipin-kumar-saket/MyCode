import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {
    static void ReverseList(ArrayList<Integer> list){
        int left=0;
        int right=list.size()-1;

        while ( left < right){

            Integer temp=Integer.valueOf(list.get(left));
            list.set(left, list.get(right));
            list.set(right , temp);


            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(14);
        list.add(19);
        System.out.println(list);
        ReverseList(list);

        System.out.println(list);
        System.out.println("using with the function ");
        Collections.reverse(list);
        System.out.println(list);

    }
}
