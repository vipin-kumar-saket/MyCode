package Practice;

public class remove_dupicate {
    public static void main(String[] args) {
        int []arr={0,1,2,2,3,0,4,2};
        int newArr[]=new int [arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
               newArr[j++]=arr[i];
            }
        }
        for(int i=0;i<newArr.length-1;i++){
            System.out.println(newArr[i]);
        }
    }
}
