import java.util.Scanner;

public class subpair_of_sum {
    public  static  void  subPair(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++)
            {
                int count=0;
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(array[k] +" ");
                    count=count+array[k];

                }
                System.out.print(")");
                System.out.println();
                System.out.println("the count of subArray is = " +count);
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
