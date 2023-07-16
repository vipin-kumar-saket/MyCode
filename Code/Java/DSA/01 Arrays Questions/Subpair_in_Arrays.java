import java.util.Scanner;

public class Subpair_in_Arrays {
    public  static  void  subPair(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++)
            {

                for(int k=i;k<=j;k++){
                    System.out.print(array[k] +" ");


                }
                System.out.println();

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
       subPair(array);
        //The next line formula is the factorial of the number that is n(n+1)/2
        System.out.println("The total number of pair is : "+ (input*(input+1)/2));

    }
}
