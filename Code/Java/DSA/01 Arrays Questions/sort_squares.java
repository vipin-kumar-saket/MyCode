import java.util.Arrays;

public class sort_squares {
   public static int [] squares(int arr[]){
       int n= arr.length;
       int left=0, right= n-1;
       int ans[]=new int [n];
       int k=0;
       while (left<=right){
           if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left] * arr[left];
                left++;
           }
           else {
               ans[k++]=arr[right] * arr[right];
               right--;
           }
       }

        return ans;
    }
    static void swap(int arr[],int left, int right){
       int temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
    }
        static void reverse(int arr[]){
            int n=arr.length;
            int left=0,right=n-1;
            while (left < right){
                swap(arr,left ,right);
                left++;
                right--;
            }

        }
    public static void main(String[] args) {
       int i=Integer.MAX_VALUE;

        int arr[]={-5,-4,-2,6,9 ,12};
        System.out.println("without square "+Arrays.toString(arr));
        int p[]=squares(arr);
        reverse(p);
        System.out.println("with square "+Arrays.toString(p));
    }
}
