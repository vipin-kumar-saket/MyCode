import java.lang.reflect.Array;
import java.util.ArrayList;

public class return_indices_of_array {

    static ArrayList<Integer> indices(int arr[] , int target , int idx){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx == arr.length) return ans;
        if(arr[idx]==target)
            ans.add(idx);
        ArrayList<Integer> smallAns=indices(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    static void index(int arr[],int target, int idx){
        if(idx== arr.length) return;
        if(arr[idx]== target) System.out.print(idx + " ");
        index(arr,target,idx+1);

    }
    public static void main(String[] args) {
        int arr[]= {1,2,1,1,2,3,1,1,1};
        int target=1;
        index(arr,target,0);
        ArrayList<Integer> ans= indices(arr, target,0);
        System.out.println(ans);
    }
}
