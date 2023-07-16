public class Target_sum {
    public static int tripleSum(int arr[],int t){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j < arr.length; j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==t){
                        sum++;
                    }
                }
            }

        }
        return sum;
    }
    public  static void t_sum(int arr[] ,int t){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={5,9,4,3,8,5,1,3,5};
        int t=12;
//        t_sum(arr,t);
        System.out.println( tripleSum(arr,t));
    }
}
