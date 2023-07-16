package Practice;
import java.util.*;
class sec_lar{
    public static void search_element( int []arr){
        Arrays.sort(arr);
        ArrayList<Integer> newArr= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                newArr.add(arr[i]);

            }
        }
            System.out.print("The second largest number is :"+newArr.get(newArr.size()-1));
    }
}
public class Second_largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number you want to create an array :");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++ )
            arr[i]=sc.nextInt();
        sec_lar l1=new sec_lar();
        l1.search_element(arr);

    }
}
