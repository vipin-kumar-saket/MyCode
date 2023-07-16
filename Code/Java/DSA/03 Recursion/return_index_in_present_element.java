import java.util.Scanner;

public class return_index_in_present_element {

    // Checking element in present in array than return index

    static int  presentElementIndex(int arr[],int x , int idx) {
        // Base case
        if(idx>=arr.length) return -1;
        // self work
        if(arr[idx]==x) return idx;
        // recursive work
        return presentElementIndex(arr,x,idx+1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The element is present on the index : "+presentElementIndex(arr, x,0));
    }
}
