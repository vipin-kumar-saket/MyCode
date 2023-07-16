package Practice;

public class array_search_no_present_add {
    public static void main(String[] args) {
        int []arr={2,4,8,9,12,19,21};
        int x=11;
        int start=0,end=arr.length;

        while(start<=end) {
            int mid = (start + end) / 2;
            if(arr[mid]==x)
                System.out.println(arr[mid]);
            if(x>arr[mid]){
                start=mid+1;



            }
            else {
                end=mid-1;


            }
        }
        System.out.println("hi"+arr[start+ 1]);
    }
}
