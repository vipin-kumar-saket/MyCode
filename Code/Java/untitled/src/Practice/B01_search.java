package Practice;
class search{
    public static int B_searchNum(int []arr,int num){
        int start =0;
        int end =arr.length;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]<num){
                start=mid+1;

            }
            else {
                end=mid-1;
            }
            mid=start+(end-start)/2;

        }
        return -1;
    }
}
public class B01_search {
    public static void main(String[] args) {
        int []arr={5,8,9,12,15,18,33,74,99};
        int num=74;
        search s=new search();
        System.out.println( s.B_searchNum(arr,num));


    }
}
