import java.util.Arrays;

public class first_even_and_last_odd_array {
    public static void swap(int arr[],int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void evenAndOdd(int arr[]){
        int n=arr.length;
        int left=0 , right=n-1;
        while(left < right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left ,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Normal array is : "+ Arrays.toString(arr));
        evenAndOdd(arr);
        System.out.println("Sorted by Even and Odd  array is : "+ Arrays.toString(arr));
    }
}
