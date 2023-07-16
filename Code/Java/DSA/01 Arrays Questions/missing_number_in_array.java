import java.util.*;

public class missing_number_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        int total = n*(n+1)/2-sum;
        System.out.println(total);
    }
}
