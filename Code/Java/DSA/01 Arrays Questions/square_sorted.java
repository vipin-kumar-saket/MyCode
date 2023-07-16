import java.util.Arrays;

public class square_sorted {
    public static void swapArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while (i < j) {

            swapArray( arr, i,j);
            i++;
            j--;

        }

    }
    public static int [] sort(int arr[]){
        int n=arr.length;
        int ans[]=new int [n];
        int left=0,  right=n-1;
        int k=0;

        while(left <= right){
            if(Math.abs(arr[left] ) >  Math.abs(arr[right] )){
               ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                    ans[k++]=arr[right]*arr[right];
                    right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        sort(arr);
       int ans[]=sort(arr);
//      reverse(ans);
        System.out.println(Arrays.toString(ans));
        reverse(ans);
        System.out.println(" after reverse  "+Arrays.toString(ans));


    }
}