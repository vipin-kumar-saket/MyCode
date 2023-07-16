package Array_list_in_java;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchElementIndex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter a number you want to create to an array size = ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr1.add(sc.nextInt());
        }
        System.out.println(arr1);
        System.out.println("Enter you want to search element in the array list ");
        int search=sc.nextInt();
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)==search){
                System.out.println(i+1);
                break;
            }
        }

    }
}
