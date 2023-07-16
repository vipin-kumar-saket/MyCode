import java.util.Arrays;
import java.util.Scanner;

public class prefix_rang_sum {
    static  int [] prefixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int [size+1];
        for(int i=1;i<=size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int pSum[] = prefixSum(arr);
        System.out.println("Prefix sum or the array is \n"+Arrays.toString(arr));
        System.out.println("Enter number of queries : ");
        int rang=sc.nextInt();

        while(rang-- >0){
            System.out.println("Enter range ");
            int l=sc.nextInt();
            int r=sc.nextInt();
           int ans = pSum[r]-pSum[l-1];
            System.out.println(ans);
        }

    }
}
