import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class swap {
    static void vSwap(int arr[] ,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int i=0,j=arr.length-1;
        while (i < j) {
            vSwap( arr, i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
