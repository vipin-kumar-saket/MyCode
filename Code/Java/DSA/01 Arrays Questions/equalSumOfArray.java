import java.util.Scanner;

public class equalSumOfArray {
    static  int prefixSum(int arr[]){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static int [] prefix(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i+1];
        }
        return arr;
    }

    static boolean equalPartitionSum(int arr[]){
        int totalSum= prefixSum(arr);
        int pSum=0;
        for(int i=0;i<arr.length;i++){
            pSum += arr[i];
            int sufSum=totalSum-pSum;
            if(pSum==sufSum){
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter size of array ");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal partition possible : "+ equalPartitionSum(arr));

    }
}
