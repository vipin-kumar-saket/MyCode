import java.util.Arrays;

public class Bubble_sort02 {
    static void bSort(int arr[]){
        // length of array
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            //n-1 iteration  passes
            for(int j=0;j<n-i-1;j++){
                /*
                last i  element already at correct sorted position ,
                so no need to check them
                 */
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={12,5,4,3,9,2,8,5,99,44,33,81};
        bSort(arr);
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
