import java.util.Scanner;

public class SubArray_sum_prefix {
    public static void prefix_of_sum(int [] array){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix [] =new int[array.length];

        // calculate the prefix of sum in the array
        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]= prefix[i-1]+array[i];
        }

        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;
               currentSum=  start==0 ?prefix[end] :  prefix[end]-prefix[start -1];

               if(maxSum < currentSum){
                   maxSum=currentSum;
               }
            }
        }
        System.out.println("The maximum sum is the the sub array is : "+ maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int input = sc.nextInt();
        int Array[] = new int[input];
        for (int i = 0; i < input; i++) {
            Array[i] = sc.nextInt();

        }
            prefix_of_sum(Array);

    }}
