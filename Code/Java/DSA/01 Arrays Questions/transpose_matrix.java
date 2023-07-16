import java.util.Scanner;

public class transpose_matrix {

    static void printMatrix(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    static  void  transpose(int arr[][] , int row,int col){
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter number of rows and columns  matrix 1 :");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int arr1[][ ]= new int[r1][c1];
        System.out.println("Enter matrix element");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1 ; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        transpose(arr1,r1,c1);
        printMatrix(arr1);

    }
}
