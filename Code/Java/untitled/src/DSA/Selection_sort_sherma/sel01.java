package DSA.Selection_sort_sherma;

public class sel01 {
    public  static void Selection_Sort(int []arr){
         int i,j,min,temp;
         for(i=0;i<arr.length-1;i++)
         {
             min=i;
             for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
             }
            if(min!=i)
            {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
  }

    }
    public static void main(String[] args) {
        int arr[]= {2,55,1,3,6,77,9,5};
        Selection_Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
