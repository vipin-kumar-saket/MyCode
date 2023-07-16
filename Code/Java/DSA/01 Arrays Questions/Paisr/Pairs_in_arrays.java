
package Paisr;

import java.util.Scanner;

public class Pairs_in_arrays {
    static  void pairArray(int []array){
        for(int i=0;i<array.length;i++){
            int current =array[i];
            for (int j=i+1;j<array.length;j++){
                System.out.print("(" + current + "," + array[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array you want to create ");
        int input=sc.nextInt();
        int array []=new int[input];
        for (int i=0;i<input;i++){
            array[i]=sc.nextInt();
        }
        pairArray(array);
        System.out.println("The total number of pair is : "+ (input*(input-1)/2));

    }
}
