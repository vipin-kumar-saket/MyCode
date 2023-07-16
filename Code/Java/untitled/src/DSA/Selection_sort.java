package DSA;

import static DSA.sortArray.selSort;

 class sortArray {
    public static void selSort(int[] arr) {
        int i,j,temp, min;
        for(i=0;i< arr.length-1;i++)
        {
            min=i;
            for (j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            if(min!=i)
            {
                temp=arr[i];
                arr[i]=arr[min];
               arr[min] =temp;

            }
        }

    }
}
public class Selection_sort {
    public static void main(String[] args) {
        int []arr={4,1,10,9,6,6,9,1,8,3};
        selSort(arr);
        System.out.println("The sorted array is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
