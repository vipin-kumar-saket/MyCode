import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class comman_nagative {
    static int com2(int arr[]){
        int narr[]=new int[arr.length];
        int a=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==0){
                    narr[a++]= Math.abs(arr[i]);
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(narr));
        Arrays.sort(narr);
        System.out.println(Arrays.toString(narr));
        if(arr.length>0) return Math.abs(narr[arr.length-1]);
        return -1;
    }
    static int com(int arr[]){
        int a=0;
        ArrayList<Integer> arrayList= new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            arrayList.add(Math.abs(arr[i]));
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        for(int i=arrayList.size()-1;i>0;i--){
            if(arrayList.get(i)== arrayList.get(i-1)){
                return arrayList.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,10,6,7,-7,1,-6};
//        System.out.println(com(arr));
        System.out.println(com2(arr));
    }
}
