package Array_list_in_java;

import java.util.ArrayList;
import java.util.Collections;

public class String_reverse {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("vipin ");
        str.add(" is");
        str.add(" name");
        str.add(" my");
        System.out.println("ascending order String is "+str);
        Collections.reverse(str);
        System.out.println("descending order String is "+str);

    }
}
