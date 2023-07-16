import java.util.Arrays;

public class two_pointers_0s_and_1s {
    static void sort(int arr[]){
        int n=arr.length;
        int zeroes=0;
        for(int i=0 ;i<n ; i++){
            if(arr[i]==0)
                zeroes++;
        }
        for(int i=0; i<n; i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
    }
        // use only one loop the program

    static void swap(int arr[],int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
        public static void OneLoopSort(int arr[]){
        int n=arr.length;
        int left=0 , right=n-1;
        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left ,right);
                left++;
                right--;

            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

        }


    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,1,0,1,0};
        System.out.println("Unsorted array is :");
        System.out.println(Arrays.toString(arr));
//        sort(arr);
        OneLoopSort(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));


    }
}
