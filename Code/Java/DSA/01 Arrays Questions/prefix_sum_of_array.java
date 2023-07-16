import java.util.Arrays;

public class prefix_sum_of_array {
    static  void prefixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        System.out.println(Arrays.toString(arr));
        prefixSum(arr);
        System.out.println(Arrays.toString(arr));
    }
}
