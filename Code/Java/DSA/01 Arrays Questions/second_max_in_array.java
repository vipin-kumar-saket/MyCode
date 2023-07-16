public class second_max_in_array {
    public static int muxNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int secondMax(int arr[]){
        int mx=muxNumber(arr);
        for(int i=0;i< arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=muxNumber(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Second max number is : "+ secondMax(arr));
    }
}
