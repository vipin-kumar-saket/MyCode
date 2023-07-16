package Vipin;

public class revarce {
    public static void main(String[] args) {
        int [] arr={10,2,54,20,9,6,5};

        int l=arr.length,temp;
        int n=Math.floorDiv(l,2);
        for(int i=0;i<n;i++)
        {
            temp= arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;


        }
       for(int element :arr){
           System.out.println(element+" ");
       }

    }
}
