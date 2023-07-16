package emp_same_name;

import emp_same_name.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<emp> empList =new ArrayList<>();


        empList.add(new emp("E0586","vipin","CEO",22));
        empList.add(new emp("E0525","saurabh","Manager",20));
        empList.add(new emp("E052547","saurabh","Coder",26));
        empList.add(new emp("E052547","Yuvraj","Ass manager",30));
        empList.add(new emp("E052547","Yuvraj","Ass manager",30));


         Map<String, Long> namecount=empList.stream().collect(Collectors.groupingBy(emp::getName ,Collectors.counting() ));
        System.out.println(namecount);

    }
}