package Array_list_in_java;

import java.util.ArrayList;
import java.util.Collections;

public class conconate_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(30);
        arr.add(22);

        Collections.sort(arr);
        System.out.println(arr);

    }
}
