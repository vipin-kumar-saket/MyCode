import java.util.Arrays;

public class sort {
    static void swap(int arr[],int left , int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,9,3,7,25};
        int n=arr.length;
        int left=0, right=n-1;
        for (int i = 0; i <n ; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
