package Practice;

public class pr02 {
    public static void main(String[] args) {
        int []arr={0,1,0,1,0};
        int count=0;
        int max=0;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                count++;
            }

            if(max<count) max=count;
            if(arr[i]==0){
                count=0;
            }

        }
        System.out.println(max);
    }
}
