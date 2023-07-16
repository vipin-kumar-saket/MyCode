public class maxIn_array {
    static int max(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=max(arr, idx+1);
        return Math.max(smallAns,arr[idx]);
    }
    public static void main(String[] args) {
        int arr[]={5,4,69,54,6};
        System.out.println(max(arr,0));
    }
}
