import java.util.Arrays;
import java.util.Scanner;

public class rotate_the_array {
    public static int [] rotate(int arr[] ,int k){
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for (int i = n-k; i <n ; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k ; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }

    // Rotate inplace means without using another array
    public static void swapArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[] ,int i,int j){
        while (i < j) {
            swapArray( arr, i,j);
            i++;
            j--;
        }
    }
    public static void inPlace(int arr[] ,int k){
        int n=arr.length;
        k=k%n;
            reverse(arr, 0,n-k-1);
            reverse(arr, n-k,n-1);
            reverse(arr, 0,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to rotate the array :");
        int k=sc.nextInt();
        System.out.println("Rotated array is :");
//        System.out.println(Arrays.toString(rotate(arr,k)));
        inPlace(arr,k);
        System.out.println(Arrays.toString(arr));
    }

}
