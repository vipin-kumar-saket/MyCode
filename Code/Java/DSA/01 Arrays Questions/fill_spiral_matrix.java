import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fill_spiral_matrix {
    static void printMatrix(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [] [] addMatrix(int n){
       int matrix [][]=new int[n][n];
        int topRow=0  , bottomRow=n-1   , leftCol=0   , rightCol=n-1;
        int curr=1;

        while ( curr <= n* n){
            // topRow -> leftCol to rightCol.
            for(int j= leftCol; j<= rightCol  && curr <=n*n ; j++){
               matrix[topRow][j] = curr++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow.
            for (int i = topRow; i <= bottomRow && curr < n*n ; i++) {
                matrix[i][rightCol]= curr++;
            }
            rightCol--;
            // bottomCol -> rightCol to leftCol.
            for (int j= rightCol; j>=leftCol && curr < n*n ; j--){
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow.
            for(int i=bottomRow ; i>=topRow && curr <n*n ;i--){
                matrix[i][leftCol] =curr++;

            }
            leftCol++;

        }
       return matrix;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int arr [] []=addMatrix(n);
        printMatrix(arr);

    }
}
