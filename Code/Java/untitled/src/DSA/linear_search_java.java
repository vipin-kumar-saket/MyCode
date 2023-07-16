package DSA;

import java.util.Scanner;

import static DSA.ls.linear_search;

class ls{
    public  static  int linear_search(int arr[],int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }

        }
        return -1;
    }
}
public class linear_search_java {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value of array you want to store : ");
        int a=sc.nextByte();

        int []arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextByte();
        }
        System.out.println("Enter a number you want to search in array : ");
        int b= sc.nextInt();
        System.out.println(linear_search(arr,b));



    }
}
