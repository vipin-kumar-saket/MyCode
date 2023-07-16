import java.util.Scanner;

public class frequency_of_array {
    public static int [] makeFrequencyArray(int arr[]){
            int frq[]= new int[100001];
            for(int i=0;i<arr.length;i++){
                frq[arr[i]]++;
            }
            return frq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int []req= makeFrequencyArray(arr);
        System.out.println("Enter the number of query ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter number to be searched ");
            int p=sc.nextInt();
            if(req[p]>0){
                System.out.println("YES");
//                System.out.println(req[p]);
            }

            else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
