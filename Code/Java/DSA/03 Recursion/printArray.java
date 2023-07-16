public class printArray {
    static void print(int arr[],int idx){
        // base case
        if(idx== arr.length) return;
        // self work
        System.out.println(arr[idx]);
        // recursive work or self work of recursion
        print(arr, idx + 1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        print(arr,0);

    }
}
