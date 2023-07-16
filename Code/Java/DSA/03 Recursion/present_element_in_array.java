import java.util.Scanner;

public class present_element_in_array {
    static boolean presentElement(int arr[],int x , int idx) {
        // Base case
        if(idx>=arr.length) return false;
        // self work
        if(arr[idx]==x) return true;
            // recursive work
        return presentElement(arr,x,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(presentElement(arr,x,0)){
            System.out.println("Yes");
        }
        else System.out.println("NO");

    }
}
