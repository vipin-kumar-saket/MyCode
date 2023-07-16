package DSA;

import static DSA.Selection_sort01.sol.printArray1;

public class Selection_sort01 {
    class sol{
        public static void printArray1(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,1,3,2,89,12,1,22};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
//            System.out.println(smallest);
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[smallest]);
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
//        printArray1(arr);
    }
}
