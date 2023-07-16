package DSA.Count_number_of_occurrences;

import java.util.Scanner;

import static DSA.Count_number_of_occurrences.CountOccurrences.count_occ;

class CountOccurrences{
    public static  int bSearch(int []arr,int x){
        int low =0;
        int high =arr.length;

        while(low <=high){
            int mid= (low+high)/2;
            if(arr[mid]==x){
                return  mid;
            }
            if(x<arr[mid]){
                high = mid -1;
            }
            else
                low = mid+1;
        }
        return -1;


    }

    public  static  int count_occ(int []arr,int x)
    {
        int index=bSearch(arr, x);
        if(index==-1){
            return 0;
        }
        int left=0, right =0;
        for(int i= index-1; i>=0 && arr[i]==x;i--){
            left++;
        }
        for(int i= index+1; i<arr.length && arr[i]==x;i++){
            right++;
        }
        return left+right+1;
    }

}


public class Count_number_of_occurrences {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a number you want to create an array :) ");
//        int input=sc.nextInt();
//        int []arr = new int [input];
//        for(int i=0;i<input;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("enter a number you want to search");
//        int a=sc.nextInt();
//        CountOccurrences cNumber= new CountOccurrences();
//        cNumber.count_occ(arr,a);

        int []arr={1,2,2,2,2,2,3,5,3,5};
        System.out.println(count_occ(arr,2));
    }
}
