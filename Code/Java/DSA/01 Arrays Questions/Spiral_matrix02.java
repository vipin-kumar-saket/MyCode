import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix02 {
    static void printMatrix(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int matrix[][],int r, int c){
        List<Integer> l1= new ArrayList<>();
        int topRow=0  , bottomRow=r-1   , leftCol=0   , rightCol=c-1;
        int totalElement=0;

        while ( totalElement < r * c){
            // topRow -> leftCol to rightCol.
               for(int j= leftCol; j<= rightCol  && totalElement < r * c; j++){
                   l1.add(matrix[topRow][j] );
                   System.out.print(matrix[topRow][j] + " ");
                   totalElement++;
               }
               topRow++;
            // rightCol -> topRow to bottomRow.
            for (int i = topRow; i <= bottomRow && totalElement < r * c ; i++) {
                l1.add(matrix[i][rightCol]);
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            // bottomCol -> rightCol to leftCol.
            for (int j= rightCol; j>=leftCol && totalElement < r * c ; j--){
                l1.add(matrix[bottomRow][j]);
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow.
            for(int i=bottomRow ; i>=topRow && totalElement < r * c ;i--){
                l1.add(matrix[i][leftCol]);
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
                leftCol++;

        }
        System.out.println(l1);
    }

    public static void main(String[] args) {
        int matrix[ ][ ]= { {1,2,3,},
                            {4,5,6},
                            {7,8,9}

                                    }     ;
        printMatrix(matrix);
        spiralMatrix(matrix , 3,3);

    }
}
