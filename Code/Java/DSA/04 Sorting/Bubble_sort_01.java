import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_sort_01 {
    static int [] sort(int arr[]){
        int n=arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1]>arr[j]){
                     temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[]={5,99,4,3,99,66,8,22};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
