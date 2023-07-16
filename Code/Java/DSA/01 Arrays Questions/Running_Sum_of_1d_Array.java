import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int nArr[]= new int [arr.length];

        int p=0;

        for(int i=0;i<=arr.length-1;i++){

            nArr[i]=p+arr[i];
            p=nArr[i];
        }
        System.out.println(Arrays.toString(nArr));
    }
}
