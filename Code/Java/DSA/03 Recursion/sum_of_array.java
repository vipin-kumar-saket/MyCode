public class sum_of_array {
    static int aSum(int [] arr, int idx){
        if(idx== arr.length){
            return 0;
        }
        int smallSum=aSum(arr, idx+1);
        return smallSum+arr[idx];
    }
    public static void main(String[] args) {
        int arr []={2,5,8,2,5,4,65,4,2,5,41};
        System.out.println(aSum(arr,0));

    }
}
