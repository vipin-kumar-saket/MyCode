import java.util.ArrayList;
import java.util.Collections;

public class subset_array_sum {
    static void subsetSum(int [] a, int n, int idx, int sum){
        ArrayList<Integer>ans= new ArrayList<>();
        if(idx>= n){

            System.out.println(sum);
            return;
        }
        subsetSum(a,n,idx+1,sum+a[idx]);
        subsetSum(a,n,idx+1,sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        subsetSum(arr,arr.length,0,0);
    }
}
