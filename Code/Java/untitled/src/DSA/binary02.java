package DSA;

class b_search{
    public static int search(int []arr,int key){
        String not="The element is not present in the array";
        int start =0;
        int end =arr.length-1;
        int mid= start+(end -start)/2;
        while(start<=end){
            if(arr[mid]==key){
                // Here it is return the middle Index . and not returning  array value
                return mid;
            }
//            if we go to right side in the array then
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
}
public class binary02 {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10,12};
        int key=12;

        b_search b1=new b_search();

        System.out.println(b_search.search(arr,key));

    }
}
